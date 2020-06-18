import java.util.Scanner;

public class TestDemo9 {
    public static int jump(int n) {
        if(n==1||n==2||n==3) {
            return n;
        }
        return (jump(n-1)+jump(n-2));
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(jump(n));
    }
}


