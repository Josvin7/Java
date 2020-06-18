import java.util.Scanner;
public class TestDemo8 {
	public static int numMax2(int a,int b) {
		return a>b?a:b;
	}
	public static int numMax3(int a,int b,int c) {
		
		return numMax2(a,b)>c?numMax2(a,b):c;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println(numMax3(a,b,c));
	}
}