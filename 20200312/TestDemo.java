import java.util.Scanner;

public class TestDemo {
    public static void println(int n) {
        while(n==0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
    public static void main (String[] args) {
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            println(n);
    }
}
