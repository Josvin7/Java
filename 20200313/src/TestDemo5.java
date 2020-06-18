import java.util.Scanner;

public class TestDemo5 {
    public static int sum(int n) {
        if(n<=9) {
            return n;
        }
        return n%10+sum(n/10);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
}
