package java_20200804;

import java.util.ArrayList;
import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test4
 * @Description
 * @Author by小房
 * @Date 2020/8/4 11:38
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n 张桌子
        int m = scanner.nextInt(); // m 批客人
        // int[] array = new int[n]; // n个参数a,即每个桌子可容纳的最大人数
        ArrayList<Integer> array = new ArrayList<>();
        // array 每张桌子最大人数
        for (int i = 0; i < n; i++) {
            array.add(scanner.nextInt());
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] aa = new int[m];
        // aa 消费金额   m批客人，每批客人有两个参数:b人数，c预计消费金额
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt(); // 人数
            int b = scanner.nextInt(); // 消费金额
            aa[i] = b;
            map.put(b, a );
        }
        array.sort(Integer::compareTo);
        int cc = n-1;
        Arrays.sort(aa);// 金额 排序
        int result = 0;
        int ui = 0;// 统计桌子
        for (int i = m-1; i >= 0; i--) {
            // 问题 直接从最大开始了
            //while (array.get(cc) )
            int max_n = array.get(cc);// 桌子最大人数
            if (map.get(aa[i]) <= max_n) {
                ui++;
                result += aa[i];
                cc--;
            }
            for (int j = 0; j < cc ; j++) {

            }
            if (ui == n) {
                break;
            }
        }
        System.out.println(result);
    }
}
