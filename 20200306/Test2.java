//
public class Test2 {
	public static void main(String[] args) {
		int n=1;
		while(n<=100) {
			int i=2;
			while(i<n) {
			if(n%i==0) {
			    break;
			}
			i++;
		    }
			if(i==n||n==1) {
				System.out.println(n+" ");
		    }
		    n++;
		}
	}
}