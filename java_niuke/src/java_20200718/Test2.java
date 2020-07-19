package java_20200718;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/19 23:03
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n ; i++) {
            list.add(scanner.nextInt());
        }
        list.sort(Integer::compareTo);
        // System.out.println(list);
        int i = 0;
        int tmp = list.get(0);
        while (i < n){
            int count = 0;
            while (i<n && list.get(i) == tmp   ) {
                count++;
                i++;
            }
            if (count % 2 != 0) {
                ans.add(list.get(i-1));
            }
            if (i < n) {
                tmp = list.get(i);
            }

        }
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
