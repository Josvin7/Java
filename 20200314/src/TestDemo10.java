import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo10
 * @Description
 * @Author by房文辉
 * @Date 2020/3/14 18:46
 */
public class TestDemo10 {
    public static int sumArray(int[] array2) {
        int sum = 0;
        for (int i = 0; i <array2.length ; i++) {
            sum+=array2[i];
        }
        return sum;
    }
        public static double avg(int[] array1) {
            double tmp = sumArray(array1);
            return tmp/array1.length;
        }
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int[] array=new int[5];
            for (int i = 0; i <array.length ; i++) {
                array[i]=scan.nextInt();
            }
            System.out.println(Arrays.toString(array));
            System.out.println(avg(array));
        }
}
