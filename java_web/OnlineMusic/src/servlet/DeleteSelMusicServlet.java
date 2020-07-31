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
 * path: OnlineMusic-servlet-DeleteSelMusicServlet
 * date: 2020/7/31 18:01
 */
@WebServlet("/deleteSelMusicServlet")
public class DeleteSelMusicServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");

        String[] values = req.getParameterValues("id[]");

        //删除
        int sum=0;
        Map<String,Object> return_map = new HashMap<>();
        //MusicDao musicDao = new MusicDao();
        MusicService musicService = new MusicService();
        for(int i=0;i < values.length;i++){
            int id = Integer.parseInt(values[i]);

            //调用Service层方法删除
            Music music = musicService.findMusicById(id);
            int delete = musicService.deleteMusicById(id);
            //sum=sum+delete;
            if(delete == 1) {
                //3、数据库删除完成后，检查还是否存在。如果不存在，那么删除掉磁盘上的文件
                File file = new File("F:\\idea_workspace\\java_web\\OnlineMusic\\web\\" + music.getUrl() + ".mp3");
                /*System.out.println("文件是否存在：" + file.exists());
                System.out.println("file: " + file);*/
                if (file.delete()) {
                    //证明删除成功
                    //map.put("msg", true);
                    sum=sum+delete;
                } else {
                    return_map.put("msg", false);
                    System.out.println("服务器删除文件失败！");
                }
            }else {
                return_map.put("msg", false);
                System.out.println("数据库删除文件失败！");
            }
        }
        //System.out.println("sum: "+sum);
        //sum==values.length 说明选中的所有元素已经全部删除了
        if(sum == values.length){
            //证明删除成功
            return_map.put("msg",true);
        }else {
            return_map.put("msg",false);
        }
        //将map转化为json
        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(resp.getWriter(), return_map);
    }
}
