public class Test1 {
	public static void main(String[] args) {
		int a=90;
		int b=20;
		int c=30;
		int max=a;
		int min=b;
		if(max>min) {
			if(max<c) {
				int tmp=max;
				max=c;
				c=tmp;
			}
		}
		else{
			if(min>c) {
				int tmp=max;
				max=min;
				min=tmp;
			}
			else {
				min=max;
				max=c;
			}
		}
		System.out.println("max="+max+"  "+"min="+min);
	}
}