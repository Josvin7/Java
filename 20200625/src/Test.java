import java.util.Scanner;


/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/6/25 17:29
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            int len = str.length();
            System.out.println(maxNum(str, len));
        }
    }

    private static String maxNum(String str, int len) {
        int count = 0;
        int beg = 0;
        for (int start = 0; start < len; ) {
            int tmp = 0;
            //while循环计算数字串长度，如果tmp大于count则更新count
            while(str.charAt(start)>='0' && str.charAt(start) <='9') {
                tmp++;
                start++;
                //这里一定要注意当最后一个数字的时候，如果不判断会出现异常
                if(start==len) {
                    break;
                }
            }
            if(tmp > count) {
                count = tmp;
                beg = start-count;
            }
            start++;

        }
        //substring（，）字符串截取的函数
        String ans = str.substring(beg, beg + count);
        return ans;
    }
}
