package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo9
 * @Description
 * @Author by小房
 * @Date 2020/7/14 17:49
 */
public class ServletDemo9 extends HttpServlet {
    ///1、 先获取 Session。 如果用户曾经没有访问过，此时就创建一个新的 Session

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession = req.getSession(true);
        // 2、判断是否是新用户
        Integer count = 1;
        if (httpSession.isNew()) {
            httpSession.setAttribute("count", count);
        } else {
            count = (Integer) httpSession.getAttribute("count");
            count = count +1;
            httpSession.setAttribute("count", count);
        }

        //3、返回响应
        resp.setContentType("text/html; charset=utf-8");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write("count"+ count);
        writer.write("</html>");

    }


}
