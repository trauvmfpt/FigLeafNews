package controller.user;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
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

public class CategoryPostController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category = ofy().load().type(Category.class)
                .filter("name", req.getPathInfo().replace("/", ""))
                .first().now();
        List<Article> articles = null;
        if (category != null){
            articles = ofy().load().type(Article.class)
                    .filter("category",
                            Ref.create(Key.create(Category.class, category.getId())))
                    .list();
        }
        req.setAttribute("articles", articles);
        req.getRequestDispatcher("/user/multil-post.jsp").forward(req,resp);
    }
}
