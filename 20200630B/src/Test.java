import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by小房
 * @Date 2020/6/30 23:14
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int N = scanner.nextInt();
           //int[] array =new int[N];
            if(N > 1000) {
                N = 1000;
            }
            ArrayList arrayList = new ArrayList();

            for (int i = 0; i < N; i++) {
                arrayList.add(i);
            }
            int ans = -1;

            while (arrayList.size() > 2) {
                int count = 0;
                System.out.println(arrayList);
                for (int i = 2; i < N; i = i + 3 ) {
                    if(N == 3) {
                         ans = (int) arrayList.get(2);
                    }
                    arrayList.remove(i - count);
                    count++;
                }
                N = arrayList.size();
            }
            System.out.println(ans);

        }
    }


}
