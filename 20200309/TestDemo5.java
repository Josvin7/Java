import java.util.Scanner;
public class TestDemo5 {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return facc(n)+sum(n-1);
	}
	public static int facc(int i) {
		if(i==1) {
			return 1;
		}
		return i*facc(i-1);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(sum(n));
	}
}