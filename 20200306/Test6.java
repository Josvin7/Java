public class Test6 {
	public static void main(String[] args) {
		double n=1;
		double sum=0.0;
		double t=-1;
		while(n<=100) {
			t*=-1;
			sum+=(double)(1/n)*t;
			n++;
		}
		System.out.println(sum);
	}
}
