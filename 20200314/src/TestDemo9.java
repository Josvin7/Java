import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo9
 * @Description 输入一个数组元素，计算每个元素的和
 * @Author by房文辉
 * @Date 2020/3/14 18:25
 */
public class TestDemo9 {
    public static int sumArray(int[] array1) {
        int sum=0;
        for (int i = 0; i <array1.length ; i++) {
            sum+=array1[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sumArray(array));
    }
}
