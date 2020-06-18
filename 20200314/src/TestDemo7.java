import java.util.Arrays;
/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo7
 * @Description 打印数组
 * @Author by房文辉
 * @Date 2020/3/14 18:13
 */

public class TestDemo7 {
    public static String  printArray(int[] array1) {
        String ret="[";
        for (int i = 0; i <array1.length ; i++) {
            ret+=array1[i];
            if(i!=array1.length-1) {
                ret+=", ";
            }
        }
        ret+="]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        System.out.println(printArray(array));
    }
}

