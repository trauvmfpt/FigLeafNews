package controller.user;

import com.google.appengine.api.search.Index;
import com.google.gson.Gson;
import entity.Article;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class SearchPostController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user/multil-post.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        List<Article> articles = ofy().load().type(Article.class)
                .filter("title", title).list();
        ServletContext sc = getServletContext();
        sc.setAttribute("articles", articles);
        getServletContext().getRequestDispatcher("/user/multil-post.jsp").forward(req, resp);
    }
}
