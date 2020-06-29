import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description  每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 * @Author by
 * @Date 2020/6/28 17:56
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            String str = scanner.nextLine();
            String[] string = str.split(" ");
            int len = string.length;
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = Integer.parseInt(string[i]);
            }
            Arrays.sort(array);
            System.out.println(array[len/2 - 1])
        }
    }
}
