package java_20200804;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test4
 * @Description
 * @Author by小房
 * @Date 2020/8/4 11:38
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] aa = new int[m];

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            aa[i] = b;
            map.put(b, a );
        }
        Arrays.sort(array);
        int cc = n-1;

        Arrays.sort(aa);
        int result = 0;
        int ui = 0;
        for (int i = m-1; i >= 0; i--) {
            int max_n = array[cc];
            if (map.get(aa[i]) <= max_n) {
                ui++;
                result += map.get(aa[i]);
                cc--;
            }
            if (ui >= n) {
                break;
            }
        }
        System.out.println(result);

    }
}
