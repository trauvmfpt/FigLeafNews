package controller;

import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class UnitTestController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(MyUtil.getInstance().toSlug(req.getParameter("text")));
    }

}
