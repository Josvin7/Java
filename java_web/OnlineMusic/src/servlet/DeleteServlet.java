package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MusicDao;
import entity.Music;
import service.MusicService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-servlet-DeleteServlet
 * date: 2020/7/31 17:36
 */
@WebServlet("/deleteServlet")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        Map<String,Object> return_map=new HashMap<>();
        String strId = req.getParameter("id");
        int id = Integer.parseInt(strId);
        //System.out.println("id:"+ id);

        MusicDao musicDao = new MusicDao();
        MusicService musicService = new MusicService();
            //1.查找有没有当前id
        Music music = musicService.findMusicById(id);
            //没有这个id的音乐 直接返回
        if(music == null) return;
            //2、如果有就开始删除库中的音乐
        int delete = musicService.deleteMusicById(id);

        if(delete == 1){
            //3、数据库删除完成后，检查还是否存在。如果不存在，那么删除掉磁盘上的文件
            File file = new File("/root/java16/apache-tomcat-8.5.57/webapps/onlineMusic/"+music.getUrl()+".mp3");
                if(file.delete()){
                //证明删除成功
                    return_map.put("msg",true);
                    System.out.println("删除文件成功！");
                }else {
                    return_map.put("msg",false);
                    System.out.println("文件名："+file.getName());
                    System.out.println("删除文件失败！");
                }
            }else {
                return_map.put("msg",false);
            }

        //将map转化为json
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(resp.getWriter(),return_map);
    }
}
