/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ThreadDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/6/12 15:15
 */
public class ThreadDemo1 {
    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("hello world, 我是一个线程");
            while (true) {

            }
        }

    }

    public static void main(String[] args) {
        // 创建线程需要使用 Thread 类, 来创建一个 Thread 的实例.
        // 另一方面还需要给这个线程指定, 要执行哪些指令/代码.
        // 指定指令的方式有很多种方式, 此处先用一种简单的, 直接继承 Thread 类,
        // 重写 Thread 类中的 run 方法.

        // [注意!] 当 Thread 对象被创建出来的时候, 内核中并没有随之产生一个线程(PCB).
        Thread t = new MyThread();
        t.start();
        while(true) {

        }

    }

}
