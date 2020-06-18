import java.util.Scanner;
public class homeWork2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=31;i>=1;i=i-2) {
			System.out.print(((n>>>i)&1)+" ");
		}
		System.out.println();
		for(int i=30;i>=0;i=i-2) {
			System.out.print(((n>>>i)&1)+" ");
		}
	}
}