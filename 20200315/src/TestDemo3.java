import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo3
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 19:21
 */
public class TestDemo3 {
    public static void bubbleSort(int[] array) {
        boolean aim = false;
        for (int i = 0; i < array.length-1; i++) {
            aim=false;
            for (int j = 0; j <array.length-i-1 ; j++) {
                if(array[j]>array[j+1]) {
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    aim = true;
                }
            }
            if(aim==false) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {12,43,654,76,8,2,23,678,34};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
