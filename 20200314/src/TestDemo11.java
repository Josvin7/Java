/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo3
 * @Description 交换两个数的值（利用数组）
 * @Author by房文辉
 * @Date 2020/3/14 15:23
 */
public class TestDemo11 {
    public static void swap1(int[] array) {
        int tmp=array[0];
        array[0]=array[1];
        array[1]=tmp;
    }
    public static void main(String[] args) {
        int[] array={10,20};
        System.out.println(array[0]+" "+array[1]);
        swap1(array);
        System.out.println(array[0]+" "+array[1]);
    }
    public static void swap(int a,int b) {
        int tmp=a;
        a=b;
        b=tmp;
    }
    public static void main1(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("交换前"+a+" "+b);
        System.out.println("====================");
        swap(a,b);
        System.out.println("交换后"+a+" "+b);
    }
}
