/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by房文辉
 * @Date 2020/6/16 22:45
 */
public class Test1 {
    public static void main(String[] args) {
        String string ="sdf(66d737ab1ce6878d_52ce80a     )";
        String str=string.substring(0, string.indexOf("("));
        int beg = string.lastIndexOf("_");
        int end = string.indexOf(" ");
        String str2 = string.substring((beg+1), end);
        System.out.println(str +" " + str2);
    }
}
