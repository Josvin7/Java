package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo4
 * @Description
 * @Author by小房
 * @Date 2020/7/14 11:52
 */
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        resp.setIntHeader("Refresh",1);

        Date data = new Date();

        Writer writer = resp.getWriter();
        writer.write("<html>");
        writer.write(data.toString());
        writer.write("</html>");
    }



}
