import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by
 * @Date 2020/6/29 19:00
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int max = (A > B)? A:B;
            for (int i = max; i <= A*B; i++) {
                if(i % A == 0 && i % B == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }


}
