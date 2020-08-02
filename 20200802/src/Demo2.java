/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Demo2
 * @Description
 * @Author by小房
 * @Date 2020/8/2 18:07
 */
import sun.net.spi.nameservice.dns.DNSNameService;

public class Demo2 {
    public static void main(String[] args) {
        ClassLoader classLoader1 = Demo2.class.getClassLoader();
        System.out.println(classLoader1);
        ClassLoader classLoader2 = String.class.getClassLoader();
        System.out.println(classLoader2);
        ClassLoader classLoader3 = DNSNameService.class.getClassLoader();
        System.out.println(classLoader3);
    }
}
