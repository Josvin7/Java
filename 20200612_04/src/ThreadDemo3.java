/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ThreadDemo3
 * @Description
 * @Author by房文辉
 * @Date 2020/6/13 0:28
 */
public class ThreadDemo3 {
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("我是一个线程");
        }
    }

    public static void main(String[] args) {
//        Thread t = new Thread(new MyRunnable());
//        t.start();
//    }
        Thread t = new Thread(() -> {
            System.out.println("我是一个线程");
        });
        t.start();
    }
}
