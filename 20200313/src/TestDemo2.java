import java.sql.SQLOutput;
import java.util.Scanner;

public class TestDemo2 {
    public static int fac(int n) {
        if(n==1) {
            return 1;
        }
        return n*fac(n-1);
    }

    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return fac(n)+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
}
