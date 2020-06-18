import java.util.Scanner;
public class homeWork3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//-1
		int count = 0;
		while(n != 0) {
			count++;
			n = n & (n-1);
		}
		System.out.println(count);
	}
}