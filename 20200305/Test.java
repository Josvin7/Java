import java.util.Scanner;
public class Test {

public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int n= scan.nextInt();
		int sum =0;
		int j=1;
		while(j<=n) {
			int i = 1;
		    int ans = 1;
		    while (i <= j) {
			ans *= i;//sum = sum+i;
			i++;
		}
		j++;
		sum+=ans;
		}
		System.out.println(sum);
	}
	
		
		
	
}
