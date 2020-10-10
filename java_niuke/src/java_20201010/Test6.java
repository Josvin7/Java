package java_20201010;
import java.util.Scanner;
/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test6
 * @Description
 * @Author by小房
 * @Date 2020/10/10 20:32
 */
public class Test6 {


    /*
     * 假设有 1 元，3 元，5 元的硬币若干（无限），现在需要凑出 11 元，问如何组合才能使硬币的数量最少？
     */

        public int getLeastNum(int[] array,int n){
            int lens=array.length;
            if(array==null||lens==0||n<0) {
                return 0;
            }

            int[] dp=new int[n+1];
            for(int i=0;i<n+1;i++) {
                dp[i]=0;
            }

            for(int i=1;i<n+1;i++){
                int min=999999;
                for(int j=0;j<lens;j++){
                    if(i-array[j]>=0){
                        int temp=dp[i-array[j]]+1;
                        if(temp<min) {
                            min=temp;
                        }
                    }
                }
                dp[i]=min;
            }
            return dp[n];
           /* for(int i=1;i<n+1;i++){
                for(int j=0;j<lens;j++){
                    if(i-array[j]>=0){
                        dp[i] = dp[i-array[j]] + 1;
                    }
                }
                //dp[i]=min;
            }
            return dp[n];*/
        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Test6 gl=new Test6();
            int[] array={1,5,3};
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int min_count=gl.getLeastNum(array, n);
            System.out.println(min_count);

        }

    }

