/**
 * @ Created with IntelliJ IDEA.
 * @ClassName SystemUtil
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 23:46
 */
public class SystemUtil {

        public static boolean isAdmin(String userId){
            return userId.toLowerCase()=="admin";
        }
        public static void main(String[] args){
            System.out.println(isAdmin("Admin"));
        }
    }

