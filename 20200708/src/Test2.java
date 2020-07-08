import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/8 18:41
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int tmp = String.valueOf(n).length();
            String[] str = new String[tmp];
            for (int i = 0; i < tmp ; i++) {
                str[i] = String.valueOf(n%10);
                n = n/10;
            }
            for (int i = 0; i < tmp ; i++) {
                System.out.print(str[i]);
            }
        }
    }
}
