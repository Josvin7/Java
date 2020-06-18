
import java.util.Scanner;
public class TestDemo1 {
	public static void check(int count) {
		while(count>0) {
			Scanner scan=new Scanner(System.in);
			String Password=scan.next();
			if(Password.equals("12345")) {
				System.out.println("密码正确");
				break;
			}
			else {
				count-- ;
			    System.out.println("输入错误，请再次输入，您还有 "+count+"次机会 ");
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("请输入正确的密码，您有3次机会！");
		int count=3;
		check(count);
	}
}