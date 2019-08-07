package controller.admin.crawler;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;
import com.google.gson.Gson;
import entity.Article;
import entity.Source;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class AddQueue extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(AddQueue.class.getSimpleName());

    private static Queue q = QueueFactory.getQueue("demo-queue");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Source> sources = ofy().load().type(Source.class).filter("status", 1).list();
        if (sources.size() == 0) {
            LOGGER.warning("sources size: " + sources.size());
            return;
        }

        for (Source source :
                sources) {
            Document document = Jsoup.connect(source.getUrl()).ignoreContentType(true).get();
            Elements elements = document.select(source.getLinkSelector());

            for (Element el :
                    elements) {
                // check link limit.
                String link = el.attr("href").trim();
                Article article = Article.Builder.anArticle()
                        .withUrl(link)
                        .withSourceId(source.getId())
                        .build();
                q.add(TaskOptions.Builder.withMethod(TaskOptions.Method.PULL).payload(new Gson().toJson(article)));
            }
        }

    }
}
