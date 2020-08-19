package java_20200816;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/8/16 16:13
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //System.out.println(str);
        String[] arrStr=str.split(" ");
        // System.out.println(arrStr);
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        for (int i = 0; i < arrStr.length ; i++) {
            System.out.println(arrStr[i]);
            if (!arrStr[i].equals("undo") && !arrStr[i].equals("redo")) {
                stack1.push(arrStr[i]);
            }

            if (!stack1.isEmpty() && arrStr[i].equals("undo")) {
                //stack1.pop();
                stack2.push(stack1.pop());
            } else if (!stack2.isEmpty() && arrStr[i].equals("redo")) {
                //stack1.pop();
                stack1.push(stack2.pop());
            }
        }
        int len = stack1.size();
        String ans = "";
        String[] str1 = new String[len];
        int i = 0;
        while (!stack1.isEmpty()) {
            str1[i++] = stack1.pop();
        }
        for (int j = len-1; j >= 0; j--) {
            ans += str1[j];
            if (j > 0) {
                ans += " ";
            }
        }
        System.out.println(ans);
    }
}
