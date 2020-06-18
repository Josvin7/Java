//求两个数最大公约数
import java.util.Scanner;
public class homeWork {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();//4
		int b=scan.nextInt();//6
		int ans=a%b;//4
		while(ans!=0) {
			a=b;//6       4
			b=ans;//4     2
			ans=a%b;//2   0
		}
		System.out.println(b);
	}
}