import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n>0) {
			int odd=n%2;
			n/=2;
			System.out.println(odd);
		}

		
	}
}