package controller.admin.category;

import com.google.gson.Gson;
import entity.Category;
import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class AddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/category/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        Category category = Category.Builder.aCategory()
                .withName(name)
                .withDescription(description)
                .withUrl(MyUtil.getInstance().toSlug(name))
                .build();
        ofy().save().entity(category).now();
        resp.sendRedirect("/admin/category/list");
//        req.getRequestDispatcher("/admin/category/list.jsp").forward(req,resp);
//        resp.setContentType("application/json");
//        resp.getWriter().println(new Gson().toJson(category));

    }
}
