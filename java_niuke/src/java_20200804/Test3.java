package java_20200804;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.*;

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

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (k > input.length || k <= 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        /*int len = input.length;
        Arrays.sort(input);
        for (int i = 0; i <= k; i++) {
            list.add(input[i]);
        }*/
        for (int i = 0; i < input.length ; i++) {
            list.add(input[i]);
        }
        list.sort(Integer::compareTo);
        list.subList(0, 3);
        return list;
    }
}
