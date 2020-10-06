package java_20201006;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description
 * @Author by小房
 * @Date 2020/10/6 21:02
 */
public class Test3 {

    public class Solution {
        /**
         *
         * @param obstacleGrid int整型二维数组
         * @return int整型
         */
        public int uniquePathsWithObstacles (int[][] obstacleGrid) {
            // write code here
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] array = new int[m][n];
            int tmp = 1;
            for (int i = 0; i <= m -1; i++) {
                    if (obstacleGrid[i][0] ==1)  {
                        tmp = 0;
                    }
                    array[i][0] = tmp;
            }
            tmp = 1;
            for (int i = 0; i <= n -1; i++) {
                if (obstacleGrid[0][i] ==1)  {
                    tmp = 0;
                }
                array[0][i] = tmp;
            }
            for (int i = 1; i <= m -1; i++) {
                for (int j = 1; j <= n -1 ; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        array[i][j] = 0;
                    }
                    else {
                        array[i][j] = array[i -1][j] + array[i][j-1];
                    }

                }

            }
            return array[m-1][n-1];
        }
    }
}
