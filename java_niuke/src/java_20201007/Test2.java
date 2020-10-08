package java_20201007;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/10/8 21:17
 */
public class Test2 {
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
            int[] maxV = new int[m + 1];
            for (int j = 0; j < m+1 ; j++) {
                maxV[j] = 0;
            }
            for (int i = 1; i < n+1 ; i++) {
                for (int j = m; j >=1 ; --j) {
                    if (A[i -1] <=j) {
                        maxV[j] = Math.max(maxV[j], maxV[j-A[i-1]] + V[i-1]);
                    }
                }
            }
            return maxV[m];
        }
    }
}
