package josvin.springboot_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin.springboot_study.controller-UserController
 * date: 2020/8/13 22:27
 */
// 当前类型注册实例到容器中，并指定为Web 请求的处理
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Map<Integer, String> test;
    @RequestMapping("/login")
    @ResponseBody
    public Object login() {
        /*
        map.put("fff", "小房");
        map.put("ttt", "汤神");*/

        return test;
    }
}
