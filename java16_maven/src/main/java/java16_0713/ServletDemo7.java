package java16_0713;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ServletDemo7
 * @Description
 * @Author by小房
 * @Date 2020/7/14 16:40
 */
public class ServletDemo7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //1、先构造 Cookie 对象，每个Cookie 对象就是一个键值对
        Cookie userName = new Cookie("userName", "fwh");
        Cookie age = new Cookie("age", 23 + "");
        //2、把 Cookie 放到响应中
        resp.addCookie(userName);
        resp.addCookie(age);
        // 3、创建一个响应报文
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("返回 cookie 成功");

    }
}
