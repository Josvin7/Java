package java_20201010;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test5
 * @Description
 * @Author by小房
 * @Date 2020/10/10 19:42
 */
public class Test5 {
    public static void main(String[] args) {
        int[] cars = new int[3];
        cars[0] = 1;
        cars[1] = 2;
        cars[2] = 5;
        int[] ans = new int[12];
        ans[0] = 0;
        for (int i = 1; i <= ans.length ; i++) {
            for (int j = 0; j < 3; j++) {
                ans[i] = Math.min(ans[i- cars[j]] +1, ans[i]);
            }


        }
        System.out.println(ans[11]);

    }
}
