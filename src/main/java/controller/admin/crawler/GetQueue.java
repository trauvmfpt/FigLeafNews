package controller.admin.crawler;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskHandle;
import com.google.gson.Gson;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import entity.Article;
import entity.Category;
import entity.Source;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class GetQueue extends HttpServlet {

    private static Queue q = QueueFactory.getQueue("demo-queue");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<TaskHandle> tasks = q.leaseTasks(10, TimeUnit.SECONDS, 1);
        if (tasks.size() > 0) {
            TaskHandle taskHandle = tasks.get(0);
            String articleObjectJson = new String(taskHandle.getPayload());
            System.out.println(articleObjectJson);
            Article article = new Gson().fromJson(articleObjectJson, Article.class);
            Source source = ofy().load().type(Source.class).id(article.getSourceId()).now();
            if (source == null) {
                return;
            }
            Document document = Jsoup.connect(article.getUrl()).ignoreContentType(true).get();
            String title = document.select(source.getTitleSelector()).text();
            String description = document.select(source.getDescriptionSelector()).text();
            String content = document.select(source.getContentSelector()).html();
            String author = document.select(source.getAuthorSelector()).text();
            article.setTitle(title);
            article.setDescription(description);
            article.setContent(content);
            article.setUrl(MyUtil.getInstance().toSlug(title));
            article.setCategory(Ref.create(Key.create(Category.class, article.getCategoryId())));
            article.setAuthor(author);
            if (ofy().load().type(Article.class).filter("url",MyUtil.getInstance().toSlug(title)).list().size() == 0){
                ofy().save().entity(article).now();
                System.out.println("Add");
                q.deleteTask(taskHandle);
            }else {
                System.out.println("This article already in Data Store");
                q.deleteTask(taskHandle);
                resp.sendRedirect("/admin/task/get");
            }

        }
    }
}
