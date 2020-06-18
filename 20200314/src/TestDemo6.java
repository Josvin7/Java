import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo6
 * @Description
 * @Author by房文辉
 * @Date 2020/3/14 18:02
 */
public class TestDemo6 {
    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
        int[] array=new int[100];
        for(int i=0;i<array.length;i++) {
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
    }
}
