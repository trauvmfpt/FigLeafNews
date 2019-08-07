package controller.user;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.ObjectifyService;
import entity.Article;
import util.MyUtil;

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
        String uriString = req.getRequestURI();
        String[] listSegment = uriString.split("/");
        System.out.println(listSegment[2]);


        String articleUrl = listSegment[2];
        req.setAttribute("article",  ofy().load().type(Article.class).filter("url",articleUrl).first().now());
        req.getServletContext().getRequestDispatcher("/user/single-post.jsp").forward(req,resp);
    }
}
