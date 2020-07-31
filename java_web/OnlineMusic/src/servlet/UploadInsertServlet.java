package servlet;

import entity.User;
import service.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-servlet-UploadInsertServlet
 * date: 2020/7/31 16:22
 */
@WebServlet("/uploadsucess")
public class UploadInsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        String singer = req.getParameter("singer");
        String fileName = (String) req.getSession().getAttribute("fileName");
        String[] string = fileName.split("\\.");
        String title = string[0];
        System.out.println("title:" + title);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(new Date());
        User user = (User) req.getSession().getAttribute("user");

        int user_id = user.getId();
        String url = "music\\" + title;

        MusicService musicService = new MusicService();
        int ret = musicService.insert(title, singer, time, url, user_id);

        if (ret == 1) {
            resp.sendRedirect("list.html");
        }

        // 上传中出现断网会怎么办
    }
}