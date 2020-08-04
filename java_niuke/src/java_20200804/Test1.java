package java_20200804;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/8/4 9:21
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            } else {
                int sum = 0;
                for (int i = 0; i < 100 ; i++) {
                    int num = scanner.nextInt();
                    sum += num;
                }
                System.out.println(sum);
            }
        }
    }
}
