import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo4
 * @Description 输入数组元素
 * @Author by房文辉
 * @Date 2020/3/14 15:37
 */
public class TestDemo4 {

    public static void main(String[] args) {
        String[] strings = new String[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }
        System.out.println(Arrays.toString(strings));
    }


    public static void main2(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //String str = scanner.nextLine();
        int[] array = new int[4];
        for (int i = 0; i <array.length ; i++) {
            array[i]=1;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main1(String[] args) {
        int[] array={1,1,2,3,4,5};
        array=null;
        //System.out.println(array[1]);
        System.out.println(array.length);
    }
}
