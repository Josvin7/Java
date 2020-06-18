import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description 数组的三种打印方法
 * @Author by房文辉
 * @Date 2020/3/14 15:07
 */
public class TestDemo1 {

    public static void main(String[] args) {
        int[] array = new int[3];
        int[] array1 = {1,2,3,4,5,5};
        int[] array3 = new int[]{1,2,3,4,5,6,7};
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i:array1) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array3));
    }
}
