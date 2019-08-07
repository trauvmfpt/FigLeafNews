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
import java.util.ArrayList;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class ListController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("sources", ofy().load().type(Source.class).list());
        req.getRequestDispatcher("/admin/source/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // xoá các source đã tick checkbox
        String strDelSources = req.getParameter("delSources");
        List<Source> delSources = new ArrayList<Source>();
        
        //ofy().delete().entities(delSources)
    }
}
