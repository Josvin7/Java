
import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description 拷贝数组
 * @Author by房文辉
 * @Date 2020/3/14 11:40
 */
public class TestDemo {
    public static int[] copyArray(int[] array) {
        int[] array1 =new int[array.length];
        for(int i=0;i<array.length;i++) {
            array1[i] =array[i];
        }
        return array1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret=copyArray(array);
        System.out.println(Arrays.toString(ret));
    }

}
