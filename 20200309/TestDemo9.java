import java.util.Scanner;
public class TestDemo9 {
	public static double numMax(double c,double d) {
		return c>d?c:d;
	}
	public static int numMax(int a,int b) {	
		return a>b?a:b;
	}
	public static void size(int a,double c,double d) {
		double max=(a>c?a:c)>d?(a>c?a:c):d;
		double min=(a<c?a:c)<d?(a<c?a:c):d;
		double mid=(a+c+d)-max-min;
		System.out.println(max+">"+mid+">"+min);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		double c=scan.nextDouble();
		double d=scan.nextDouble();
		int ret1=numMax(a,b);
		double ret2=numMax(c,d);
		System.out.println(ret1);
		System.out.println(ret2);
		size(a,c,d);
	}
}