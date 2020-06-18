import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo8
 * @Description
 * @Author by房文辉
 * @Date 2020/3/14 18:20
 */
public class TestDemo8 {
    public static void  transform(int[] array1) {
        for (int i = 0; i <array1.length ; i++) {
            array1[i]*=2;
        }
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,9};
        System.out.println(Arrays.toString(array));
        transform(array);
        System.out.println(Arrays.toString(array));
    }
}
