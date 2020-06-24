import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description  汽水瓶
 * @Author by房文辉
 * @Date 2020/6/24 17:25
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int num1 = scanner.nextInt();
            int ans = howNum(num1);
            System.out.println(ans);

        }
    }

    private static int howNum(int num1) {
        int count = 0;
        if(num1 == 0 || num1 ==1) {
            return 0;
        }
        if(num1 ==2 ) {
            return 1;
        }
        return count = count +num1/3 + howNum(num1/3 + num1%3);
    }
}
