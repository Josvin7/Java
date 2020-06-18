public class TestDemo3 {
	public static void mul(int i) {
		for(int j=1;j<=i;j++) {
				int ans=i*j;
				System.out.print(j+"*"+i+"="+ans+"  ");
			}
	}
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			mul(i);
			System.out.println("  ");
		}
	}
}

