import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n>0) {
			int ans=n%10;
			n=n/10;
			System.out.println(ans);
		}
	}
}