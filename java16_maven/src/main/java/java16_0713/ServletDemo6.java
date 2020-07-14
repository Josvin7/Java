package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo6
 * @Description  返回一个重定向页面
 * @Author by小房
 * @Date 2020/7/14 16:34
 */
public class ServletDemo6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("http://www.sogou.com");
    }
}
