import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		while(n>0) {
			if(n%2==1) {
				count++;
			}
			n/=2;
		}
		System.out.println(count);
	}
}