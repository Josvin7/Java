package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo8
 * @Description
 * @Author by小房
 * @Date 2020/7/14 17:42
 */
public class ServletDemo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        resp.setContentType("text/html; charset=utf-8");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        for (Cookie cookie : cookies
             ) {
            writer.write(cookie.getName() + ": " + cookie.getValue());
            writer.write("</br>");
        }
        writer.write("</html>");

    }
}
