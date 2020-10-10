package java_20201010;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/10/10 15:33
 */
public class Test2 {

    public class Solution {
        /**
         *
         * @param S string字符串
         * @param T string字符串
         * @return int整型
         */
        public int numDistinct (String S, String T) {
            // write code here
            if (S.length() < T.length()) {
                return  0;
            }

             int len = T.length();
             int[] ans = new int[len];
            for (int i = 0; i < len; i++) {
                ans[i] = 0;
            }

            for (int i = 0, j = 0; i < len; i++) {
                for (; j <S.length() ; j++) {
                    if (S.charAt(j) == T.charAt(i)) {
                        ans[i]++;
                    }
                }
                j--;
            }
            int anss = 1;
            for (int i = 0; i < len ; i++) {
                anss  *= ans[i];

            }
            return anss;
        }
    }
}
