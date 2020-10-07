package java_20201006;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test4
 * @Description
 * @Author by小房
 * @Date 2020/10/6 23:26
 */
public class Test4 {
    public class Solution {
        /**
         * @param m: An integer m denotes the size of a backpack
         * @param A: Given n items with size A[i]
         * @param V: Given n items with value V[i]
         * @return: The maximum value
         */
        public int backPackII(int m, int[] A, int[] V) {
            // write your code here
            int n = A.length;
            if (n == 0 || m == 0) {
                return 0;
            }
            int[][] maxV = new int[n + 1][m + 1];
            for (int i = 0; i < n+1 ; i++) {
                for (int j = 0; j < m+1 ; j++) {
                    maxV[i][j] = 0;
                }
            }
            for (int i = 1; i < n+1 ; i++) {
                for (int j = 1; j < m+1 ; j++) {
                    if (A[i -1] <=j) {
                        maxV[i][j] = Math.max(maxV[i-1][j], maxV[i-1][j-A[i-1]] + V[i-1]);
                    }
                    else {
                        maxV[i][j] = maxV[i-1][j];
                    }
                }
            }
            return maxV[n][m];
        }
    }
}
