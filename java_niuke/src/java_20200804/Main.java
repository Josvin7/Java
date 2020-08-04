package java_20200804;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Main
 * @Description
 * @Author by小房
 * @Date 2020/8/4 10:48
 */
import java.util.Scanner;
//  abcd12345ed125ss123456789
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = 0;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9' ) {
                count++;
                i++;
            }
            if (count > len) {
                 start = i-count;
                len = count;
            }
        }
        System.out.println(str.substring(start, start+len  ));

    }
}