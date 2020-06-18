import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo12
 * @Description  数组的四种拷贝方式
 * @Author by房文辉
 * @Date 2020/3/14 20:10
 */
public class TestDemo12 {
    public static int[] copyArray(int[] array) {
        int[] array2=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            array2[i] = array[i];
        }
        return array2;
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println("拷贝前array："+ Arrays.toString(array));
        int[] dest = new int[array.length];
        System.arraycopy(array,0,dest,0,array.length);
        //int[] ret = Arrays.copyOf(array,array.length);
        //ret[0] = 999;
       // System.out.println("拷贝后ret修改:"+Arrays.toString(ret));
        System.out.println("拷贝后dest："+ Arrays.toString(dest));
        int[] array1 = {2,3,4,5,6};
        int[] ret = array1.clone();
        System.out.println("ret:"+Arrays.toString(ret));
    }
}
