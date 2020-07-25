package java_20200725;

import java.util.Stack;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/25 13:27
 */
public class Test2 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        if (stack1.empty()) {
            stack1.push(node);
            stack2.push(node);
        } else {
            stack1.push(node);
            if (node > stack2.peek()) {
                stack2.push(stack2.peek());
            } else {
                stack2.push(node);
            }
        }
    }

    public void pop() {
        if (stack1.empty()) {
            return;
        }
        stack1.pop();
        stack2.pop();

    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}