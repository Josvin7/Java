/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ThreadDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/6/13 0:17
 */
public class ThreadDemo2 {
    private static long count = 100_000_000L;

    public static void main(String[] args) throws InterruptedException {
        //serial();
        concurrency();
    }

    private static void serial() {
        long beg = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i <count ; i++) {
            a++;
        }
        int b = 0;
        for (long i = 0; i < count ; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - beg) + "ms");
    }

    private static void concurrency() throws InterruptedException {
        long beg = System.currentTimeMillis();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                 int a = 0;
                for (long i = 0; i < count ; i++) {
                    a++;
                }
            }
        };
        t1.start();
        Thread t2 = new Thread() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count ; i++) {
                    a++;
                }
            }
        };
        t2.start();

        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - beg) + "ms");
    }
}
