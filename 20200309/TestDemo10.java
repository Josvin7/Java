import java.util.Scanner;
public class TestDemo10 {
	public static double sum(double c,double d,double e) {
		return c+d+e;
	}
	public static int sum(int a,int b) {
		
		return a+b;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		double c=scan.nextDouble();
		double d=scan.nextDouble();
		double e=scan.nextDouble();
		System.out.println(sum(a,b));
		System.out.println(sum(c,d,e));
	}
}