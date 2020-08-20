package java_20200804;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description
 * @Author by小房
 * @Date 2020/8/4 11:03
 */
public class Test3 {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 9;
        array[1] = 6;
        array[2] = 67;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k <= 0) {
            return list;
        }
        for (int i = 0; i < input.length ; i++) {
            list.add(input[i]);
        }
        list.sort(Integer::compareTo);
        ArrayList<Integer> ans = new ArrayList<>(list.subList(0, k));
        return ans;
    }
}
