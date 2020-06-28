import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/6/27 23:33
 */
public class Test {
    static int count = 0;//计数，有count种
    static  int n;//输入n个想要得到的物品
    static int[] num ;//数组
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            n = scanner.nextInt();
            num = new int[n];
            //将 输入的n 种数据保存进去
            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
            }
            process(40, n);
            System.out.println(count);
        }
    }
    //注意 n 种物品 和数组下标的关系
    public static void process(int v, int n) {
        //可能1：刚好达到40  对count++
        if(v == 0) {
            count++;
            return;
        }
        //可能2：没有达到40，没有物品了
        //可能3：超过40
        if(((v > 0) && ( n < 1 )) || v < 0 ) {
            return ;
        }
        process(v-num[n-1], n-1);
        process(v , n-1);

    }
}
