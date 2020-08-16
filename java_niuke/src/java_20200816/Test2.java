package java_20200816;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/8/16 19:57
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        char[] chars1= str1.toCharArray();
        char[] chars2=str2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            if (!tofind(chars1,chars2[i])) {
                System.out.println(false);
                return;
            }
            chars1[i] = '0';
        }
        System.out.println(true);
    }
    private static boolean tofind(char[] chars1, char c) {
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] == c) {
                return true;
            }
        }
        return false;
    }
}
