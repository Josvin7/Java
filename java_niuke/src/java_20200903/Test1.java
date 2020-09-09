package java_20200903;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/8/22 9:16
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] aa = new int[n];
            int[] view_aa = new int[n];
            long max = 0L;
            for (int i = 0; i < n; i++) {
                aa[i] = scanner.nextInt();
            }
            Arrays.sort(aa);
            int[][] num = new int[m][2];
            for (int i = 0; i < m; i++) {
                num[i][0] = scanner.nextInt();
                num[i][1] = scanner.nextInt();
            }
            Arrays.sort(num, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o2[1] - o1[1];
                }
            });
            for (int i = 0; i < m; i++) {
                if (aa[n-1] < num[i][0]) {
                    continue;
                }
                int index = dic(aa,num[i][0]);
                while (index < n && view_aa[index] == 1 ){
                    index++;
                }
                if (index < n) {
                    max += num[i][1];
                    view_aa[index] = 1;
                }
            }
            System.out.println(max);
        }
    }

    private static int dic(int[] aa, int ints) {
        int left = 0;
        int right = aa.length-1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (ints <= aa[mid]) {
                right = mid-1;
            }else {
                left = mid +1;
            }
        }
        return left;
    }
}

