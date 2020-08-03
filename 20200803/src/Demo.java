import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Demo
 * @Description
 * @Author by小房
 * @Date 2020/8/3 23:38
 */
public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int ret = 0;
                for (int i = 1; i <= 1000; i++) {
                    ret += i;
                }
                return ret;
            }
        };

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread t = new Thread(futureTask);
        t.start();
        // get 方法阻塞，直到线程结束
        Integer result = futureTask.get();
        System.out.println(result);
    }
}
