
public class Test8 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i<=999;i++) {
			int j=i;
			int a=j%10;
			j=j/10;
			int b=j%10;
			int c=j/10;
			sum=a*a*a+b*b*b+c*c*c;
			if(sum==i) {
				System.out.println(i);
			}
		}	
	}
}