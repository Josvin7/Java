/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo4
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 19:40
 */
public class TestDemo4 {
    public static boolean sortOfArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = {1,23,45,67,89,76,231};
        System.out.println(sortOfArray(array));
    }
}
