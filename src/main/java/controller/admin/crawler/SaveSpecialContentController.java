package controller.admin.crawler;

import com.google.appengine.api.users.UserService;
import com.google.gson.Gson;
import entity.Article;
import org.json.JSONObject;
import util.MyUtil;
import util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class SaveSpecialContentController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(SaveSpecialContentController.class.getSimpleName());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        String requestBody = StringUtil.convertInputStreamToString(req.getInputStream());
        JSONObject jsonObject = new JSONObject(requestBody);
        String title = jsonObject.getString("title");
        String description = jsonObject.getString("description");
        String content = jsonObject.getString("content");
        String author = jsonObject.getString("author");
        Article article = Article.Builder.anArticle()
                .withTitle(title)
                .withUrl(MyUtil.getInstance().toSlug(title))
                .withContent(content)
                .withDescription(description)
                .withAuthor(author)
                .build();
        ofy().save().entity(article).now();
        resp.getWriter().println(new Gson().toJson(article));
    }
}