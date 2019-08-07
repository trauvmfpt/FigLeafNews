package controller.admin.article;



import com.google.gson.Gson;
import entity.Article;
import entity.Category;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;



public class ListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("categories", ofy().load().type(Category.class).list());
        List<Article> articles = ofy().load().type(Article.class).list();
        req.setAttribute("articles",articles);
        Logger.getLogger(new Gson().toJson(articles));
        System.out.println(new Gson().toJson(articles));
        req.getRequestDispatcher("/admin/article/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
