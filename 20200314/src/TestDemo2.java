import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/3/14 15:15
 */
public class TestDemo2 {
    public static void print(int[] array2) {
        array2[2]=999;
        for(int i=0;i<array2.length;i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(array.length);
        System.out.println(array[2]);
        array[2]=333;
        System.out.println(array[2]);
        print(array);
        System.out.println(Arrays.toString(array));
    }
}
