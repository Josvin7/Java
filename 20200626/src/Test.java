import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/6/26 18:44
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(count(num));
        }
    }
    private static int count(int num) {
        if(num % 8 ==0) {
            return num/8;
        }
        if((num % 8) % 6 == 0 || (num % 8 +  8 ) % 12 == 0 || (num % 8 + 16) % 18 == 0) {
            return num/8 +1;
        }
        return -1;
    }
}
