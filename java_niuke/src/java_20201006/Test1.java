package java_20201006;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/10/6 19:57
 */
public class Test1 {
    public class Solution {
        public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
            if (triangle.isEmpty()) {
                return 0;
            }

            ArrayList<ArrayList<Integer>> minPathSum = new ArrayList<>(triangle);

            int row = triangle.size();
            for (int i = row - 2; i >= 0  ; --i) {
                int temp = 0;
                for (int j = 0; j <=  i ; j++) {
                    temp = Math.min(minPathSum.get(i + 1).get(j), minPathSum.get(i + 1).get(j + 1));
                    minPathSum.get(i).add(temp + minPathSum.get(i).get(j));
                }

            }
            return minPathSum.get(0).get(0);


        }
    }
}
