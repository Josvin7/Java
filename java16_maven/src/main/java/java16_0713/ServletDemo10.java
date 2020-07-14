package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo10
 * @Description
 * @Author by小房
 * @Date 2020/7/14 18:05
 */
@MultipartConfig
public class ServletDemo10 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //路径  f:/java16/images
        String basePath = "f:/java16/images/";
        Part image = req.getPart("image");

        String path = basePath + image.getSubmittedFileName();

        image.write(path);

        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("图片上传成功");

    }
}
