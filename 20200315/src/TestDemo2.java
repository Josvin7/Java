/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 17:16
 */
public class TestDemo2 {
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
}
