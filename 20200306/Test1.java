import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int i=2;
		while(i<n) {
			if(n%i==0) {
				System.out.println(n+"不是素数");
			    break;
			}
			i++;

		}
		if(i==n||n==1) {
			System.out.println(n+"是素数");
		}
		
	}
}