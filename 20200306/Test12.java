import java.util.Scanner;
public class Test12 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=(int)(Math.random()*10);
		int n=scan.nextInt();
		if(n==num) {
			System.out.println("恭喜您猜对了！");
		}
		else {
			System.out.println("很遗憾，您答错了！");
			System.out.println("num ="+num);
		}
	}
}