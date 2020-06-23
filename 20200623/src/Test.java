import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description  回文串
 * @Author by房文辉
 * @Date 2020/6/23 22:56
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入两行字符串
        while(scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int ans = palindrome(str1, str2);
            System.out.println(ans);
        }
    }
    //统计个数
    private static int palindrome(String str1, String str2) {
        int count = 0;
        for (int i = 0; i <= str1.length() ; i++) {
            //将str2 插入str1   使用StringBuffer
            StringBuffer str = new StringBuffer();
            str = str.insert(0,str1);
            str = str.insert(i, str2);
            if(ispalindrome(str)) {
                count++;
            }
        }
        return count;
    }
    //判断是否为回文
    private static boolean ispalindrome(StringBuffer str) {
        int j = str.length();
        for (int i = 0; i < j ; i++) {
            if(str.charAt(i) != str.charAt(j-1)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
