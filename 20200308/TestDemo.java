import java.util.Scanner;
public class TestDemo {
	public static int numMax(int a,int b) {
		int max=a;
		if(a<b) {
			max=b;
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int res=numMax(a,b);
		System.out.println(res);
	}
}