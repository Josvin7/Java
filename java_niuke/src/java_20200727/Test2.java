package java_20200727;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/27 23:13
 */
public class Test2 {
    public int JumpFloor(int target) {
        if (target <= 0) {
            return 0;
        }
       int[] dp = new int[target +1];
       dp[0] = 1;
       dp[1] = 1;

        for (int i = 2; i <= target ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];

    }
}
