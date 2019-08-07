package controller.admin.category;

import entity.Category;
import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class EditController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long CatId =  Long.parseLong(req.getParameter("id"));
        Category category= ofy().load().type(Category.class).id(CatId).now();
        System.out.println(category.getName());
        req.setAttribute("category",category);
        req.getRequestDispatcher("/admin/category/edit.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("CateId"));
        Long CatId = Long.parseLong(req.getParameter("CateId"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        Category oldCategory= ofy().load().type(Category.class).id(CatId).now();
        oldCategory.setName(name);
        oldCategory.setDescription(description);
        oldCategory.setUpdatedAtMLS(Calendar.getInstance().getTimeInMillis());
        ofy().save().entity(oldCategory).now();
        resp.sendRedirect("/admin/category/list");
    }
}
