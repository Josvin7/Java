package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Music;
import entity.User;
import service.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-servlet-FindLoveMusicServlet
 * date: 2020/7/31 19:01
 */
@WebServlet("/findLoveMusic")
public class FindLoveMusicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String str = req.getParameter("loveMusicName");
        //System.out.println("loveMusicName:"+str);
        User user = (User) req.getSession().getAttribute("user");
        int user_id = user.getId();
        //MusicDao musicDao = new MusicDao();
        MusicService musicService = new MusicService();
        List<Music> musics = null;
        if(str != null) {
            musics = musicService.ifMusicLove(str,user_id);//关键字查询
        }else {
            musics = musicService.findLoveMusic(user_id);
        }
        /*for (Music music : musics) {
            System.out.println(music.getUrl());
        }*/
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(resp.getWriter(),musics);
    }
}
