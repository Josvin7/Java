import java.util.Scanner;

public class TestDemo6 {
    public static int fabon(int n) {
        if(n==1||n==2) {
            return 1;
        }
        return fabon(n-1)+fabon(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(fabon(n));
    }
}
