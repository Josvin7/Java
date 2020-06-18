import java.util.Scanner;
public class TestDemo {
	public static void odd(int n) {
		for(int i=31;i>=1;i=i-2) {
			System.out.print(((n>>>i)&1)+"  ");
		}
	}
	public static void even(int n) {
		for(int i=30;i>=0;i=i-2) {
			System.out.print(((n>>>i)&1)+"  ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		odd(n);
		System.out.println();
		even(n);
	}
}