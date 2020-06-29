
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int ans=1;
        int min=a;
        if(a>b) {
            min=b;
        }
        for(;min>=1;min--) {
            if(a%min==0&&b%min==0) {
                ans=min;
                break;
            }
            min--;
        }
        System.out.println(ans);
    }
}
