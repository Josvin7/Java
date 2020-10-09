package java_20201009;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/10/9 17:50
 */
public class Test1 {
    public class Solution {
        /**
         *
         * @param s string字符串
         * @return int整型
         */
        public int minCut (String s) {
            // write code here
            if (s.length() == 0) {
                return 0;
            }

            boolean[][] isPal = new boolean[s.length()][s.length()];
            for (int i = s.length()-1; i >=0 ; i--) {
                for (int j = i; j < s.length() ; j++) {
                    if (j == i) {
                        isPal[i][j] = true;
                    }
                    else if (j == i+1) {
                        isPal[i][j] = (s.charAt(i) == s.charAt(j));
                    }
                    else {
                        isPal[i][j] = ((s.charAt(i) == s.charAt(j)) && isPal[i + 1][j - 1]);
                    }

                }

            }

            int[] minCut = new int[s.length() + 1];
            // 初始化 i - 1
            for (int i = 0; i < s.length() + 1 ; i++) {
                minCut[i] = i - 1;
            }
            for (int i = 1; i <= s.length(); i++) {
                // 判断他整体是不是回文 ，是的话就置为 0；
                for (int j = 0; j < i ; j++) {
                    // 判断 j， i-1
                    if (isPal[j][i-1])
                    {
                        minCut[i] = Math.min(minCut[i], minCut[j]  + 1);
                    }
                }
            }
            return minCut[s.length()];
        }

        private boolean isPal(String s, int start, int end) {
            for (int i = start ; i < end ; i++) {
                if (s.charAt(i) != s.charAt(end))  {
                    return false;
                }
                end--;

            }
            return true;
        }
    }
}
