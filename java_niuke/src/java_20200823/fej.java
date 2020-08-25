package java_20200823;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName fej
 * @Description
 * @Author by小房
 * @Date 2020/8/24 11:41
 */
public class fej {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (str.charAt(0) == 'n') {
            str = str.substring(1,str.length());
        }
        String a = String.valueOf(str.charAt(0));
        System.out.print(a.toUpperCase());
        for (int i = 1; i <str.length() ; i++) {
            if (str.charAt(i) == 'n') {
                System.out.println();
                System.out.print("N");
                i++;
            }
            System.out.print(str.charAt(i));
        }
    }
}
