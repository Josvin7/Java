import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 16:18
 */
public class TestDemo1 {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
    }

    public static void reverse(int[] array) {
        int left =0;
        int right =array.length-1;
        while(left<right) {
            int tmp=array[left];
            array[left]=array[right];
            array[right]=tmp;
            left++;
            right--;
        }

    }
    public static void main(String[] args) {
        int[] array ={331,2,321,4,65,76,876};
        //bubbleSort(array);
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}
