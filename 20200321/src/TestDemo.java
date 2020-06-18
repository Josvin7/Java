import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/21 19:13
 */
public class TestDemo {
    public static void evenodd(int[] array) {
        int i=0;
        int j=array.length-1;
        while(i<j) {
            if(array[i]%2==0) {
                i++;
            }
            if(array[j]%2!=0) {
                j--;
            }
            if(i<j) {
                int tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,65};
        System.out.println(Arrays.toString(array));
        evenodd(array);
        System.out.println(Arrays.toString(array));
    }
}


