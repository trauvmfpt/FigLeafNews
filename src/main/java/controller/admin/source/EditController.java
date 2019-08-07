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

public class EditController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String strSourceId = req.getParameter("id");
        long sourceId = 0;
        try {
            sourceId = Long.parseLong(strSourceId);
        } catch (NumberFormatException ex) {}
        Source source = ofy().load().type(Source.class).id(sourceId).now();
        req.setAttribute("source", source);
        req.setAttribute("categories",ofy().load().type(Category.class).list());
        req.getRequestDispatcher("/admin/source/edit.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = req.getParameter("url");
        String strSourceId = req.getParameter("id");
        long sourceId = 0;
        try {
            sourceId = Long.parseLong(strSourceId);
        } catch (NumberFormatException ex) {}
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

        Source source = ofy().load().type(Source.class).id(sourceId).now();
        source.setUrl(url);
        source.setLinkSelector(linkSelector);
        source.setLinkLimit(linkLimit);
        source.setTitleSelector(titleSelector);
        source.setDescriptionSelector(descriptionSelector);
        source.setContentSelector(contentSelector);
        source.setAuthorSelector(authorSelector);
        source.setCategory(Ref.create(Key.create(Category.class, categoryId)));
        ofy().save().entity(source).now();
        resp.sendRedirect("/admin/source/list");
    }
}
