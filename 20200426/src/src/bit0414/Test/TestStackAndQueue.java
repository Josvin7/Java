package src.bit0414.Test;


import java.util.*;
import java.util.Queue;
import java.util.Stack;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestStackAndQueue
 * @Description
 * @Author by房文辉
 * @Date 2020/4/26 18:25
 */
public class TestStackAndQueue {
    public static void main(String[] args) {
       // Stack<Integer> stack = new Stack<>();
       // stack.push(1);
       // stack.push(2);
       // stack.push(3);
       // stack.push(4);
       // stack.push(5);
// 标准库中的 Stack 如果针对空栈进行 pop 或者 peek 就会抛出一个 EmptyStackException

     /*   while (!stack.empty()) {
            Integer cur = stack.pop();
            System.out.println(cur);
        }
        System.out.println("=======================");*/
        // 由于标准库中的 Stack 是一个继承自 Vector 的类. Vector 能执行的操作, Stack 一样也能执行.
        // Stack 并没有起到 限制灵活性 的效果, 反而增加了代码的复杂程度
        // 实际使用 Stack 的时候, 尽量避免使用这些本不应该是 Stack 该有的操作
        //stack.add(0,100);

       // System.out.println(stack.get(0));
       // stack.contains(2);

        // 标准库中的队列, Queue 是一个 interface
        // 只能实例化一个实现 Queue 接口的类
        // 标准库中的队列是基于链表实现的.
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);

        queue.offer(3);
        queue.offer(4);



        //
        while (!queue.isEmpty()) {
              Integer cur = queue.poll();
              System.out.println(cur);
          }





    }

}
