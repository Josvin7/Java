import java.util.Scanner;
public class TestDemo1 {
	public static int fac(int n) {
		if(n==1) {
			return 1;
		}
		return n*fac(n-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int res=fac(n);
		System.out.println(res);
	}
}