import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 23:12
 */
public class TestDemo1 {
    public static void main(String[] args) {
        char[] array = {'J','o','s','v','i','n'};
        String str = new String(array);
        System.out.println(str.charAt(1));
        System.out.println(str);
        char[] array2 = str.toCharArray();
        for (int i = 0; i <array2.length ; i++) {
            System.out.print(array2[i]);

        }
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
