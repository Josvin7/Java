import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo5
 * @Description 拼接
 * @Author by房文辉
 * @Date 2020/3/14 15:54
 */
public class TestDemo5 {
    public static void print(int[] array1) {
        String ret="[";
        for (int i = 0; i <array1.length ; i++) {
            ret+=array1[i];
            if(i!=array1.length-1) {
                ret+=", ";
            }
        }
        ret+="]";
        System.out.println(ret);

    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        System.out.println("===============");
        print(array);
    }
}
