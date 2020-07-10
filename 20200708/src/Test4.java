import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test4
 * @Description
 * @Author by小房
 * @Date 2020/7/8 22:31
 */
public class Test4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            if (N == 1 || N == 0) {
                System.out.println(0);
            }
            for (int i = 0; i < N -1; i++) {
                if(N > Fib(i) && N < Fib(i+1)) {
                    System.out.println( (N - Fib(i) > Fib(i+1) -N) ? Fib(i+1)-N :N - Fib(i));
                    break;
                }
            }
        }
    }
    //计算第n个Fibonacci数
    private static int Fib(int n) {
        if(n == 1 || n == 0) {
            return n;
        }
        return Fib(n-1) + Fib(n-2);
    }

        public int countWays(int x, int y) {
            // write code here
            if (x == 1) {
                return 1;
            }
            if (y == 1) {
                return 1;
            }
            return countWays(x-1, y) + countWays(x, y-1);
        }

}
