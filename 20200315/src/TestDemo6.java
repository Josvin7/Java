import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo6
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 20:02
 */
public class TestDemo6 {
    public static int[] copyOf(int[] array) {
        int[] ret=new int [array.length];
        for(int i=0;i<array.length;i++) {
            ret[i]=array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,78,8765,23,78};
        int[] ans = copyOf(array);
        System.out.println(Arrays.toString(ans));
    }
}
