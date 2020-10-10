package java_20201010;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description
 * @Author by小房
 * @Date 2020/10/10 16:20
 */
public class Test3 {

    public class Solution {
        /**
         *
         * @param S string字符串
         * @param T string字符串
         * @return int整型
         */
        public int numDistinct (String S, String T) {
            // write code here
            int len1 = S.length();
            int len2 = T.length();
            int[][] numD = new int[len1 + 1][len2 + 1];
            // 初始化
            for (int i = 0; i <=len1 ; i++) {
                numD[i][0] = 1;
            }
            for (int i = 0; i <=len2 ; i++) {
                numD[0][i] = 0;
            }
            for (int i = 1; i <= len1 ; i++) {
                for (int j = 1; j <= len2 ; j++) {
                    if (S.charAt(i - 1)  == T.charAt(j - 1)) {
                        numD[i][j] = numD[i - 1][j - 1] + numD[i - 1][j];
                    }
                    else {
                        numD[i][j] = numD[i - 1][j];
                    }
                }
            }
            return  numD[len1][len2];
        }
    }

}
