package controller.user;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import entity.Article;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class SinglePostController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        req.setAttribute("article",  ofy().load().type(Article.class).id(Long.parseLong(id)).now());
        req.getServletContext().getRequestDispatcher("/user/single-post.jsp").forward(req,resp);
    }
}
