package java_20200930;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/9/30 21:13
 */
public class Test1 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            int ret = array[0];
            for (int i = 1; i < array.length ; i++) {
                array[i] = Math.max(array[i-1] + array[i], array[i]);
                if (ret < array[i]) {
                     ret = array[i];
                }
            }
            return ret;
        }
    }
}
