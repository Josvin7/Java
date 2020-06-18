import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		while(scan.hasNext()) {
				int year=scan.nextInt();
				if(year<=18) {
					System.out.println("当前年龄的人是少年");
				}
				else if(year>=19&&year<=28) {
					System.out.println("当前年龄的人是青年");
				}
				else if(year>=29&&year<=55) {
					System.out.println("当前年龄的人是中年");
				}
				else {
					System.out.println("当前年龄的人是老年");
				}
		}
		
	}
}