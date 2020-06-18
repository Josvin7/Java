import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/3/21 19:33
 */
public class TestDemo1 {
    public static void swapArray(int[] array1,int[] array2) {
        for(int i=0;i<=array1.length-1;i++) {
            int tmp=array1[i];
            array1[i]=array2[i];
            array2[i]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,0};
        swapArray(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
