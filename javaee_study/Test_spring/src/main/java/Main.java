import josvin.Duck;
import josvin.Duck2;
import josvin.Duck3;
import josvin.DuckShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
        * spring 开启容器的方式：ApplicationContext 应用上下文（配置管理 Bean 对象， 。。）
        *
        * */
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");

        // 通过 bean 的名称获取 bean 对象，bean 名称就是xml 中的bean 的id

        String fwh = (String) context.getBean("fwh");
        //String fwh2 = (String)context.getBean("java.lang.String#0");
        System.out.println(fwh);
        //System.out.println(fwh2);

        // 通过类型获取 bean 对象，只有唯一才可以
        //System.out.println(context.getBean(String.class));

        Duck d11 = (Duck) context.getBean("d11");
        System.out.println(d11);
        Duck2 d2 = (Duck2) context.getBean("d2");
        System.out.println(d2);

        Duck3 d3 = (Duck3) context.getBean("d3");
        System.out.println(d3);

        DuckShop duckShop = (DuckShop) context.getBean("shop");
        System.out.println(duckShop);
    }
}
