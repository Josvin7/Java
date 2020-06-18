import java.util.Scanner;

public class TestDemo7 {
    public static int fabon(int n) {
        int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fabon(n));
    }
}
