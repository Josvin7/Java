import java.util.Scanner;
public class TestDemo2 {
	public static int takeBit(int n) {
		return n%10;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n>0) {
			System.out.println(takeBit(n));
			n=n/10;
		}
	}
}