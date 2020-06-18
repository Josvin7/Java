import java.util.Scanner;
public class TestDemo4 {
	public static int check(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length-1;i++) {
			int j=i+1;
			int tmp=0;
			while(j<arr.length) {
				if((arr[i]-arr[j])!=0) {
					j++;
				}
				else {
					tmp=1;
					ans= arr[i];
					break;
				}
			}
			if(tmp==1) {
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 6, 1};
		System.out.println(check(arr));
	}
}