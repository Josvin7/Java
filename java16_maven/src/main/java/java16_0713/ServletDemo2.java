package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo2
 * @Description
 * @Author by小房
 * @Date 2020/7/13 19:40
 */
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理表单数据
        String firstName = req.getParameter("firstName");
        String secondName = req.getParameter("secondName");

        //构造响应页面
        resp.setContentType("text/html; charset=utf-8");
        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write("firstName" + firstName);
        writer.write("<br/>");
        writer.write("secondName" + secondName);
        writer.write("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
