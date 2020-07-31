package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;
import service.MusicService;

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
 * path: OnlineMusic-servlet-LoveMusicServlet
 * date: 2020/7/31 18:42
 */
@WebServlet("/loveMusicServlet")
public class LoveMusicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String strId = req.getParameter("id");
        int musicId = Integer.parseInt(strId);
        //System.out.println("musicID: "+musicId);
        User user = (User) req.getSession().getAttribute("user");
        int user_id = user.getId();
        MusicService musicService = new MusicService();
        Map<String,Object> return_map = new HashMap<>();
        //插入之前需要先查看是否该音乐已经被添加到喜欢列表
        boolean effect = musicService.findMusicByMusicId(user_id, musicId);
        if(effect) {
            return_map.put("msg",false);
        }else {
            boolean flg = musicService.insertLoveMusic(user_id,musicId);
            if(flg) {
                return_map.put("msg",true);
            }else {
                return_map.put("msg",false);
            }
        }
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(resp.getWriter(),return_map);

    }
}
