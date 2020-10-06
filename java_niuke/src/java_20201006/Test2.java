package java_20201006;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/10/6 20:21
 */
public class Test2 {

    public class Solution {
        /**
         *
         * @param m int整型
         * @param n int整型
         * @return int整型
         */
        public int uniquePaths (int m, int n) {
            // write code here
            if (m == 1) {
                return 1;
            }
            if ( n == 1) {
                return 1;
            }
            int[][] array = new int[m][n];
            for (int i = 0; i <= m -1; i++) {
                for (int j = 0; j <= n -1 ; j++) {
                    array[i][j] = 1;
                }

            }
            array[0][0] = 1;
            for (int i = 1; i <= m -1; i++) {
                for (int j = 1; j <= n -1 ; j++) {

                    array[i][j] = array[i -1][j] + array[i][j-1];
                }

            }
            return array[m-1][n-1];
        }
    }
}
