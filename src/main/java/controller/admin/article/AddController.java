package controller.admin.article;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.Ref;
import entity.Article;
import entity.Category;
import util.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.logging.Logger;

import static com.googlecode.objectify.ObjectifyService.ofy;
@MultipartConfig
public class AddController extends HttpServlet {
    private String pathname = "picture/";
    private static final Logger LOGGER = Logger.getLogger(AddController.class.getSimpleName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", ofy().load().type(Category.class).list());
        req.getRequestDispatcher("/admin/article/add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String url = MyUtil.getInstance().toSlug(title);
        String description = req.getParameter("description");
        String content = req.getParameter("content");
        String strCategoryId = req.getParameter("categoryId");
        long categoryId = 0;
        try {
            categoryId = Long.parseLong(strCategoryId);
        } catch (NumberFormatException ex) {
            LOGGER.warning("Can not parse categoryId.");
            LOGGER.warning(ex.getMessage());
        }
//        Xử lý ảnh
        Part filePart = req.getPart("file"); // Retrieves <input type="file" name="file">
        String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
        InputStream fileContent = filePart.getInputStream();

//        Lấy đường dẫn ảnh để lưu
        String uploadPath = getServletContext().getRealPath("")
                + File.separator + pathname;
//      Tạo tên mới cho file
        String newFileName = Calendar.getInstance().getTimeInMillis() + "." + MyUtil.getInstance().getFileExtension(fileName);

        File newPic = new File(uploadPath, newFileName);
//        Lưu Ảnh
        try {
            Files.copy(fileContent,newPic.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

//        End xử lý ảnh

        Article article = Article.Builder.anArticle()
                .withUrl(url)
                .withTitle(title)
                .withDescription(description)
                .withContent(content)
                .withThumbnail("/" + pathname + newFileName)
                .withCategory(Ref.create(Key.create(Category.class, categoryId)))
                .build();
        ofy().save().entity(article).now();
        resp.getWriter().println("Okie");
    }
}
