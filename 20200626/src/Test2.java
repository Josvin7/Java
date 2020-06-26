import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by房文辉
 * @Date 2020/6/26 20:08
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            int n1 = str1.length();
            int n2 = str2.length();
            System.out.println(delect(str1, str2, n1, n2));
        }
    }

    private static String delect(String str1, String str2, int len1, int len2) {
        String ans = "";
        for (int i = 0; i < len1 ; i++) {
            int j = 0;
            boolean tmp = true;
            while (j < len2 ) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    tmp = false;
                    break;
                }
                j++;
            }
            if(tmp == true) {
                ans = ans + str1.charAt(i);
            }

        }
        return ans;
    }
}
