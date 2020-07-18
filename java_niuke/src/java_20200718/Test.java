package java_20200718;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/7/18 16:31
 */
public class Test {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int arr = scanner.nextInt();
            int[] array = new int[arr];
            for (int i = 0; i < arr; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            int[] ans = new int[3];
            int j = 0;
            for (int i = 0; i < arr - 1; ) {
                int count = 1;
                while (i < arr - 1 && array[i] == array[i + 1]) {
                    count++;
                    i++;
                }
                if (count % 2 != 0 && i < arr - 1) {

                    ans[j] = array[i];
                    j++;
                }
                i++;
            }
           if (ans.length == 1) {
                System.out.println(ans[0] + " " + array[1]);
           } else {
                System.out.println(ans[0] + " " + ans[1]);
            }



    }
}
