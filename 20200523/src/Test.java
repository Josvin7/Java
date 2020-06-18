import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/5/23 22:53
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(CalcAutomorphicNumbers(n));

        }
        scanner.close();
    }

    public static int CalcAutomorphicNumbers(int n) {
        if (n == 0 || n == 1) {
            return n + 1;
        } else {
            int count = 2;
            for (int i = 2; i <= n; i++) {
                // if (isNum(i)) {
                // count++;
                // // System.out.println(i);
                // }
                if (isNum2(i)) {
                    count++;
                    System.out.println(i);
                }
            }
            return count;
        }
    }

    // 方法1:if判断是否位数匹配
    public static boolean isNum(int i) {
        int s = i * i;
        // 除到0就可以了
        while (i != 0) {
            int tmp1 = i % 10;
            i /= 10;
            int tmp2 = s % 10;
            s /= 10;
            if (tmp1 != tmp2) {
                return false;
            }
        }
        return true;
    }

    // 方法2:调用endsWith()方法直接判断
    public static boolean isNum2(int i) {
        int s = i * i;
        if (String.valueOf(s).endsWith(String.valueOf(i))) {
            return true;
        } else {
            return false;
        }
    }

}