package java_20200929;

import java.util.Set;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/9/29 23:10
 */
public class Test1 {
    public class Solution {
        public boolean wordBreak(String s, Set<String> dict) {
            boolean[] ans = new boolean[s.length()+1];

            ans[0] = true;
            for (int i = 1; i <= s.length(); ++i) {
                for (int j = i - 1; j >= 0; --j) {
                    if (ans[j] && dict.contains(s.substring(j,i))) {
                        ans[i] = true;
                        break;
                    }
                }
            }
            return ans[s.length()];

        }
    }
}
