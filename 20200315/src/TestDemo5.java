/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo5
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 19:50
 */
public class TestDemo5 {
    public static String toString(int[] array) {
        String ret ="[";
        for (int i = 0; i < array.length-1; i++) {
            ret +=array[i];
            if(i<array.length-2) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println(toString(array));
    }
}
