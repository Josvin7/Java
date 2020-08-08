package java_20200808;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test22
 * @Description
 * @Author by小房
 * @Date 2020/8/8 15:37
 */


import java.util.*;
public class Test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int j = 0; j < T; j++) {
            int n = scanner.nextInt();
            int[] arrays = new int[n];
            for (int i = 0; i < n ; i++) {
                arrays[i] = scanner.nextInt();
            }
            //Arrays.sort(arrays);
            System.out.println(maxPresent(arrays, n));
        }
    }
    public static int maxPresent (int[] presentVec, int n) {
        // write code here
        //int n = presentVec.length;
        if(n == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += presentVec[i];
        }
        //简化为背包问题
        int v = (sum + 1) / 2;
        int[] dp = new int[v+1];
        for(int i = 0; i < n; i++){
            int p = presentVec[i];
            for(int j = v; j >= p; j--){
                dp[j] = Math.max(dp[j], dp[j-p]+p);
            }
        }
        int result = 2*dp[v] - sum;
        return  result >= 0 ? result : -result;
    }
}