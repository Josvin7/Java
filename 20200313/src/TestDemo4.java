import java.util.Scanner;

public class TestDemo4 {
    public static int facc(int n) {
        if(n==1) {
            return 1;
        }
        return n*facc(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(facc(n));
    }
}
