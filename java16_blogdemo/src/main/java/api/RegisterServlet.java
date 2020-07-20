package api;

import modle.User;
import modle.UserDao;
import view.HtmlGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName RegisterServlet
 * @Description
 * @Author by小房
 * @Date 2020/7/20 16:46
 */
public class RegisterServlet extends HttpServlet {
    //浏览器通过 POST 方法提交注册信息给服务器

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 1、获取到前端提交的数据（用户名， 密码），校验是否合法
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if (name == null || "".equals(password)) {
            // 用户提交的数据有误，返回一个错误页面
            String html = HtmlGenerator.getMessagePage("用户名或者密码输入错误", "register.html");
            resp.getWriter().write(html);
            return;
        }
        //2、拿着用户名在数据库中进行查找， 看看用户名是否已经存在，如果存在，认为注册失败（用户名不能重复）
        UserDao userDao = new UserDao();
        User existUser = userDao.selectByName(name);
        if (existUser != null) {
            String html = HtmlGenerator.getMessagePage("用户名重复，请换个名字！", "register.html");
            resp.getWriter().write(html);
            return;
        }

        //3、根据前端提交的数据， 构造 User 对象并插入到数据库当中
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        userDao.add(user);

        // 4、返回一个结果页面， 提示当前注册成功
        String html = HtmlGenerator.getMessagePage("注册成功！点击跳转登录页面", "login.html");
        resp.getWriter().write(html);
    }
}
