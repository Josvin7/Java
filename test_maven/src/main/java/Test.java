
import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/7/9 22:30
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int len = str.length();
            int[] array = new int[len];
            for (int i = 0; i <len ; i++) {
                array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            Arrays.sort(array);
            if (len == 1) {
                System.out.println(array[0] + ":" + 1);
                return;
            }
            int i = 0;
            for (; i < len-1 ; i++) {
                int count = 1;
                while ( i < len-1 && array[i+1] == array[i]) {
                    count++;
                    i++;
                }
                System.out.println(array[i] + ":" + count);

            }
            if (i == len-1) {
                System.out.println(array[len-1] + ":" + 1);
            }
        }
    }
}