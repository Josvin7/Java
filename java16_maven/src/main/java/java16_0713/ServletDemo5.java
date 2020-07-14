package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo5
 * @Description
 * @Author by小房
 * @Date 2020/7/14 16:30
 */
// 返回一个404 页面
public class ServletDemo5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendError(404, "页面没找到");
    }
}
