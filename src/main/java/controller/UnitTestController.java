package controller;

import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

//@WebServlet("/upload")
@MultipartConfig(location = "../Rss")
public class UnitTestController  extends HttpServlet {

    private String pathname = "picture/";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part filePart = req.getPart("file"); // Retrieves <input type="file" name="file">
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
        InputStream fileContent = filePart.getInputStream();
        // ... (do your job here)
        File uploads = new File(pathname);
        String uploadPath = getServletContext().getRealPath("")
                + File.separator + pathname;


        String newFileName = Calendar.getInstance().getTimeInMillis() + "." + MyUtil.getInstance().getFileExtension(fileName);

        File newPic = new File(uploadPath, newFileName);
        Files.copy(fileContent,newPic.toPath());
        resp.sendRedirect("/" + pathname + newFileName);
    }
}
