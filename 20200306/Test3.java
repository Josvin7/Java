public class Test3 {
	public static void main(String[] args) {
		int n=1000;
		while(n<=2000) {
			if(n%4==0&&n%100!=0||n%400==0) {
				System.out.println(n+"是闰年");
			}
			n++;
		}
	}
}
