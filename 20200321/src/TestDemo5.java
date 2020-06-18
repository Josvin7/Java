/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo5
 * @Description    实现交换两个变量的值。要求：需要交换实参的值
 * @Author by房文辉
 * @Date 2020/3/21 21:04
 */

public class TestDemo5 {
    public static void swap(int[] array) {
    int tmp =array[0];
    array[0]=array[1];
    array[1]=tmp;
    }
    public static void main(String[] args) {
        int[] array={10,20};
        swap(array);
        System.out.println(array[0]+"  "+array[1]);
    }
}
