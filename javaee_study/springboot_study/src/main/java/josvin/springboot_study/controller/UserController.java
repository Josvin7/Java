package josvin.springboot_study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin.springboot_study.controller-UserController
 * date: 2020/8/13 22:27
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public Object login() {
        Map<String, String> map = new HashMap<>();
        map.put("fff", "小房");
        map.put("ttt", "汤神");
        return map;
    }
}
