import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestCalcAutomorphicNumbers
 * @Description  功能: 求出n以内的自守数的个数
 * @Author by
 * @Date 2020/5/23 22:02
 */
public class TestCalcAutomorphicNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(n + "以内自守数个数为： " + CalcAutomorphicNumbers(n-1));
        }

    }

    private static int CalcAutomorphicNumbers(int n) {
        int count = 0;
        while(n >= 0) {
            if(isnum(n)) {
                count++;
            }
            n--;
        }
        return count;
    }

    private static boolean isnum(int n ) {
        int ans = n;
        int s = n * n;
        while(n != 0) {
            if(n % 10 != s % 10) {
                return false;
            }
            n = n / 10;
            s = s / 10;
        }
        System.out.println(ans);
        return true;
    }
}
