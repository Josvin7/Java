
public class Test7 {
	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=100;i++) {
			int tmp=i%10;
			if(tmp==9) {
				count++;
			}
			if(tmp%10==9) {
				count++;
			}
		}
		System.out.println(count);
	}
}