import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/7/8 17:24
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int count = 0;
            for (int i = n; i >=1 ; i--) {
                int tmp = i;
                while (tmp %5 == 0 ) {
                    count++;
                    tmp /= 5;
                }
            }
            System.out.println(count);
        }
    }
}
