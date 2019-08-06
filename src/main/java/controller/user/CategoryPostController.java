package controller.user;

import entity.Category;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class CategoryPostController extends HttpServlet {

    private static Logger LOGGER = Logger.getLogger(CategoryPostController.class.getSimpleName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String category = req.getPathInfo();
        LOGGER.log(Level.INFO, String.format("%s", category));
        req.setAttribute("articles", ofy().load().type(Category.class)
                .filter("category", category)
                .list());
        req.getRequestDispatcher("/user/multil-post.jsp").forward(req,resp);
    }
}
