package java_20201006;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/10/6 21:31
 */
public class Test {

    public class Solution {
        /**
         *
         * @param grid int整型二维数组 
         * @return int整型
         */
        public int minPathSum (int[][] grid) {
            // write code here
            if (grid.length == 0) {
                return 0;
            }
               
            int row = grid.length;
            int col = grid[0].length;
            for (int i = 1; i < row; i++) {
                grid[i][0] += grid[i-1][0];
            }
            for (int i = 1; i < col; i++) {
                grid[0][i] += grid[i-1][0];
            }
            for (int i = 1; i < row ; i++) {
                for (int j = 1; j < col; j++) {
                    grid[i][j] = Math.min(grid[i-1][j], grid[i-1][j-1]) + grid[i][j];
                }
            }
            int minPath = grid[row-1][0];
            for (int i = 1; i < col; i++) {
                if (grid[row-1][i]  < minPath) {
                    minPath = grid[row-1][i];
                }
            }
            return minPath;
        }
    }
}
