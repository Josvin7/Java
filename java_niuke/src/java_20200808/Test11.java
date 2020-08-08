package java_20200808;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test11
 * @Description
 * @Author by小房
 * @Date 2020/8/8 15:15
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int j = 0; j < T; j++) {
            int n = scanner.nextInt();
            int[] arrays = new int[n];
            for (int i = 0; i < n ; i++) {
                arrays[i] = scanner.nextInt();
            }
            Arrays.sort(arrays);
            int sum = 0;
            for(int i = 0; i < n; i++){
                sum += arrays[i];
            }
            System.out.println(toHelper(arrays, n, sum));
        }
    }
    private static int toHelper(int[] arrays, int n, int sum) {
        if (n<1) {
            return sum;
        }
        int max = arrays[n-1];
        int j = n-1;
        while(j  >= 0) {
            int count = 0;
            count += arrays[j];
            if (count == max) {

                return sum-2*count;
            }
            if (count > max) {
                count -= arrays[j];
            }
            j--;
        }
        //sum = sum - max;
        return toHelper(arrays, n-1, sum);
    }
}