import java.util.Scanner;

public class TestDemo3 {
    public static int sum(int n) {
        if(n==1) {
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
}
