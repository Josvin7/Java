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
        //Scanner scanner = new Scanner(System.in);
        String str ="hello undo redo ghj";
        //System.out.println(str);
        String[] arrStr=str.split(" ");
        System.out.println(arrStr);
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        int tmp = 0;
        for (int i = 0; i < arrStr.length ; i++) {
            System.out.println(arrStr[i]);
            if (arrStr[i] != "undo" && arrStr[i] != "redo") {
                stack1.push(arrStr[i]);
            }
            if (!stack1.isEmpty() && arrStr[i] == "undo") {
                stack2.push(stack1.pop());
               // tmp = 1;
            }
            if (!stack2.isEmpty() && arrStr[i] == "redo") {

                stack1.push(stack2.pop());
            }
        }

        String ans = "";
        while (!stack1.isEmpty()) {
            ans += stack1.pop();
            //if ()
            ans += " ";
        }

        System.out.println(ans);

    }
}
