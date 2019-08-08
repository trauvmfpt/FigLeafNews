package controller.user;


import entity.Article;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class SearchPostController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("search");
        System.out.println(title);
        List<Article> articles = ofy().load().type(Article.class)
                    .filter("url" + " >=", title)
                .filter("url" + " <",  title + "\uFFFD" )
                .list();
        List<Article> articles2 =  ofy().load().type(Article.class)
                .filter("description" + " >=", title)
                .filter("description" + " <",title + "\uFFFD")
                .list();
        List<Article> articles3 =  ofy().load().type(Article.class)
                .filter("title" + " >=", title)
                .filter("title" + " <",title + "\uFFFD")
                .list();
        for (Article x : articles2){
            if(!articles.contains(x)){
                articles.add(x);
            }
        }
        for (Article x : articles3){
            if(!articles.contains(x)){
                articles.add(x);
            }
        }
        System.out.println(articles.size());
//        ServletContext sc = getServletContext();
        req.setAttribute("articles", articles);
        getServletContext().getRequestDispatcher("/user/multil-post.jsp").forward(req, resp);
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
