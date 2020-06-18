public class ho {
	public static void main(String[] args) {
		for (int i = 0;i <= 999999 ; i++) {
			int count = 0;//数字的位数
			int tmp = i;//先保存i到tmp
			while (tmp != 0) {
				count++;//1  2  3
				tmp = tmp/10;//123/10=12  12/10=1  1/10=0
			}
			tmp = i;
			int sum = 0;
			while (tmp != 0) {
				sum += Math.pow(tmp%10,count);//复合运算符-》
				tmp = tmp/10;//123/10 =  12  12/10=1  1/10=0
			}
			if(sum == i) {
				System.out.println(sum + "是要找的数字！");
			}
			
		}

	}

}
