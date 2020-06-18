import java.util.Scanner;
public class homeWork1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		while(n!=0) {
			if((n & 1)==1) {
				count++;
			}
			n=n>>>1;
		}
		System.out.println(count);
	}
}