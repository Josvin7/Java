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
            int[] array2 = new int[arr+1];

        for (int i = 0; i < arr; i++) {
            array2[i] = array[i];
        }
        array2[arr] = array[arr -1];
        int len = array2.length;
            int[] ans = new int[2];
            int j = 0;
            for (int i = 0; i < len-1; i++) {
                int count = 1;
                while ( i < len-1 && array2[i] == array2[i+1] ) {
                    count++;
                    i++;
                }
                if ((count % 2 != 0) ) {
                    ans[j] = array2[i];
                    j++;
                }
                if ((count % 2 == 0) && ) {
                    ans[j] = array2[i];
                    j++;
                }

            }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
