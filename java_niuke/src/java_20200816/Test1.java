package java_20200816;

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
        Stack<String> stack = new Stack<String>();
        int tmp = 0;
        String ss = null;

        String ans = "";
        while(!stack.isEmpty()) {
            ans = ans + stack.pop();
            if (!stack.isEmpty()) {
                ans += " ";
            }
        }


        System.out.println(ans);

    }
}
