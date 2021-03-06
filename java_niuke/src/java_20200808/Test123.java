package java_20200808;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test123
 * @Description
 * @Author by小房
 * @Date 2020/8/8 20:01
 */
public class Test123 {
    public static void main(String[] args) {
        System.out.println(helper("789", "789"));
    }

    public static String helper(String num1, String num2) {
        while(num1.length() < num2.length()) {
            num1 = "0" + num1;     //预处理成等长字符串
        }
        while(num2.length() < num1.length()) {
            num2 = "0" + num2;     //预处理成等长字符串
        }
        StringBuilder s1 = new StringBuilder(num1).reverse();
        StringBuilder s2 = new StringBuilder(num2).reverse();       //反过来0下标对应个位
        StringBuilder r = new StringBuilder();
        int flag =0;                                             //用flag标记jie位
        for(int i = 0; i < s1.length(); ++i) {
            int sum = f(s1.charAt(i)) - flag  - f(s2.charAt(i));
            flag = 0;
            //sum = sum ;
            r.append((sum+10)%10);
            if (sum < 0){
                flag = 1;
            }
        }
        String str =  r.reverse().toString();

        int len = str.length();
        int index = 0;
        while( index < len && str.charAt(index) == '0' ) {
            index++;
        }
        if (index == len) {
            return "0";
        }else {
            return str.substring(index, len);
        }
    }
    public static int f(char c) { return c - '0';}     //字符变数字
}
