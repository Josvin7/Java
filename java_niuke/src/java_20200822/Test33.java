package java_20200822;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test33
 * @Description
 * @Author by小房
 * @Date 2020/8/22 20:28
 */
public class Test33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i+1;
        }
        for (int i = 0; i <m ; i++) {
            int tmp = scanner.nextInt();
            if (tmp == 1) {
                swp(num);
            }
            if (tmp == 2) {
                swp2(num);
            }
        }
        System.out.println(Arrays.toString(num));
    }

    private static void swp2(int[] num) {
        for (int i = 0; i < num.length-1 ; i++) {
            int tmp = num[i+1];
            num[i+1] = num[i];
            num[i] = tmp;
            i++;
        }
    }
    private static void swp(int[] num) {
        int tmp = num[0];
        for (int i = 0 ; i < num.length-1 ; i++) {
            num[i] = num[i+1];
        }
        num[num.length-1] = tmp;
    }
}
