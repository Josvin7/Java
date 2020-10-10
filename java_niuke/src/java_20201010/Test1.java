package java_20201010;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/10/10 15:10
 */
public class Test1 {

    public class Solution {
        /**
         *
         * @param word1 string字符串
         * @param word2 string字符串
         * @return int整型
         */
        public int minDistance (String word1, String word2) {
            // write code here
            int len1 = word1.length();
            int len2 = word2.length();
            int[][] minD = new  int[len1 +  1][len2 + 1];
            // 一定要注意初始化 行和列
            for (int i = 0; i <= len1 ; i++) {
                minD[i][0] = i;
            }
            for (int i = 0; i <= len2 ; i++) {
                minD[0][i] = i;
            }
            for (int i = 1; i <= len1 ; i++) {
                for (int j = 1; j <= len2 ; j++) {
                    // 插入 删除
                    minD[i][j] = Math.min(minD[i][j-1], minD[i-1][j]) + 1;
                    // 判断word1的第i个字符是否与word2的第j个字符相等
                    if (word1.charAt(i-1) == word2.charAt(j-1)) {
                        minD[i][j] = Math.min(minD[i][j], minD[i-1][j-1]);
                    }
                    else {
                        minD[i][j] = Math.min(minD[i][j], minD[i-1][j-1]  + 1);
                    }
                }
            }
            return minD[len1][len2];
        }
    }
}
