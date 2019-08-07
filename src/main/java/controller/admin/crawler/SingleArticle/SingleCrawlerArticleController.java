package controller.admin.crawler.SingleArticle;

import com.google.gson.Gson;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import entity.Article;
import entity.Category;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class SingleCrawlerArticleController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/crawler/singleArticle/singleArticle.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getParameter("url");
        String titleSelector = req.getParameter("titleSelector");
        String descriptionSelector = req.getParameter("descriptionSelector");
        String contentSelector = req.getParameter("contentSelector");
        String imageSelector = req.getParameter("imageSelector");

        Document document = Jsoup.connect(url).ignoreContentType(true).get();
        String title = document.select(titleSelector).text();
        String description = document.select(descriptionSelector).text();
        String content = document.select(contentSelector).html();
        Element imageElement = document.select(imageSelector).first();
        String imageUrl = imageElement.attr("abs:src");
        HashMap<String, String> responseObject = new HashMap<>();

        Category defaultCate = ofy().load().type(Category.class).filter("name","News").first().now();
//        resp.getWriter().println(defaultCate.getName());
//        return;
        Article article = Article.Builder.anArticle()
                .withTitle(title)
                .withDescription(description)
                .withContent(content)
                .withUrl(MyUtil.getInstance().toSlug(title))
                .withCategory(Ref.create(Key.create(Category.class, defaultCate.getId())))
                .withThumbnail(imageUrl)
                .build();
        ofy().save().entity(article).now();
        resp.sendRedirect("/admin/article/list");

//        responseObject.put("url", url);
//        responseObject.put("title", title);
//        responseObject.put("content", content);
//        responseObject.put("titleSelector", titleSelector);
//        responseObject.put("description", description);
//
////        responseObject.put("doc", document.html());
//        resp.getWriter().println(new Gson().toJson(responseObject));
    }
}
