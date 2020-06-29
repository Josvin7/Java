import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description  ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) 的算术平方根    2
 * @Author by
 * @Date 2020/6/29 17:59
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            int[][] array = new int[w][h];
            int count =0;
            int tmp = 0;
            //两层for循环对二维数组填充，可以放蛋糕的填1，不能放蛋糕的填0
            for (int i = 0; i < w; i++) {
                //填充时，tmp控制每2次给count赋值0或者1，目的交换每一行是从1开始还是从0开始填。

                if(tmp == 2){
                    count = 1;
                    tmp = 0;
                }else {
                    count = 0;
                }
                tmp++;

                for (int j = 0; j < h; j++) {

                    if (count == 0 ) {
                        array[i][j] = 1;
                        if (j+1 < h){
                            array[i][j+1] = 1;
                            j++;
                        }
                        count = 1;
                    } else {
                        array[i][j] = 0;
                        if (j+1 < h){
                            array[i][j+1] = 0;
                            j++;
                        }
                        count = 0;
                    }
                }
            }
            int sum = 0;
            //对数组求和
            for (int i = 0; i <w ; i++) {
                for (int j = 0; j < h; j++) {
                    sum = sum + array[i][j];
                }
            }
            System.out.println(sum);

        }
    }
}
