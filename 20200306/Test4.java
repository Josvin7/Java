
public class Test4 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				int ans=i*j;
				System.out.print(j+"*"+i+"="+ans+"  ");
			}
			System.out.println("  ");
		}
	}
}
