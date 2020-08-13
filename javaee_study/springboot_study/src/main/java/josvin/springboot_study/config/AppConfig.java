package josvin.springboot_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin.springboot_study.config-AppConfig
 * date: 2020/8/13 23:01
 */
@Configuration
public class AppConfig {

    @Bean
    public Map<Integer, Integer> test() {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.put(2, 330);
        return map;
    }
}
