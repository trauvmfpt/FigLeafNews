package controller.admin.source;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import entity.Category;
import entity.Source;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class AddController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", ofy().load().type(Category.class).list());
        req.getRequestDispatcher("/admin/source/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        String url = req.getParameter("url");
        String name = req.getParameter("name");
        String linkSelector = req.getParameter("linkSelector");
        int linkLimit = 10;
        try {
            linkLimit = Integer.parseInt(req.getParameter("linkLimit"));
        }catch (NumberFormatException ex){}
        String titleSelector = req.getParameter("titleSelector");
        String descriptionSelector = req.getParameter("descriptionSelector");
        String contentSelector = req.getParameter("contentSelector");
        String authorSelector = req.getParameter("authorSelector");
        long categoryId = 0;
        try {
            categoryId = Long.parseLong(req.getParameter("categoryId"));
        }catch (NumberFormatException ex){}
        Source source = Source.Builder.aSource()
                .withUrl(url)
                .withName(name)
                .withLinkSelector(linkSelector)
                .withLinkLimit(linkLimit)
                .withTitleSelector(titleSelector)
                .withDescriptionSelector(descriptionSelector)
                .withContentSelector(contentSelector)
                .withAuthorSelector(authorSelector)
                .withCategory(Ref.create(Key.create(Category.class, categoryId)))
                .build();
        ofy().save().entity(source).now();
        req.getRequestDispatcher("admin/source/list.jsp").forward(req,resp);
    }
}
