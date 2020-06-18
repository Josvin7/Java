import java.util.Scanner;
public class TestDemo7 {
	public static void odd_even(int[] arr) {
		for(int i=0;i<arr.length-1;i=i+2) {
			int tmp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tmp;
		}
	}
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 8 ,6, 1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		odd_even(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}	

}