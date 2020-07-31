package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-servlet-LoginServlet
 * date: 2020/7/31 11:02
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User loginUser = new User();
        loginUser.setPassword(password);
        loginUser.setUsername(username);

        UserService userService = new UserService();
        User user = userService.login(loginUser);

        Map<String ,Object> return_map = new HashMap<>();

        if (user != null) {
            System.out.println("登录成功！");
            req.getSession().setAttribute("user", user);//绑定数据
            return_map.put("msg", true);
        } else {
            System.out.println("登录失败！");
            return_map.put("msg", false);
        }

        ObjectMapper mapper = new ObjectMapper(); //利用Jackson将map转化为json对象
        mapper.writeValue(resp.getWriter(),return_map);


        System.out.println(username + " " + password);
    }
}
