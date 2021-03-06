package servlet;

import entity.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-servlet-UploadMusicServlet
 * date: 2020/7/31 15:56
 */
@WebServlet("/upload")
public class UploadMusicServlet extends HttpServlet {
    //private final String SAVEPATH = "F:\\idea_workspace\\java_web\\OnlineMusic\\web\\music";
    private final String SAVEPATH = "/root/java16/apache-tomcat-8.5.57/webapps/onlineMusic/music/";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        User user = (User) req.getSession().getAttribute("user");
        if (user == null) {
            System.out.println("请登陆后在上传音乐！");
            resp.getWriter().write("<h2> 请登录后再上传音乐！</h2>");
            return;
        } else {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);

            List<FileItem> fileItems = null;

            try {
                fileItems = upload.parseRequest(req);
            } catch (FileUploadException e) {
                e.printStackTrace();
                return;
            }
            System.out.println("fileItems: " + fileItems);
            FileItem fileItem = fileItems.get(0);
            System.out.println("fileItem: " + fileItem);

            String fileName = fileItem.getName();

            req.getSession().setAttribute("fileName", fileName);
            try {
                fileItem.write(new File(SAVEPATH, fileName));
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            resp.sendRedirect("uploadsucess.html");
        }


    }
}
