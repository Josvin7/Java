package java_20200816;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test22
 * @Description
 * @Author by小房
 * @Date 2020/8/20 20:47
 */
import java.util.*;
public class Test22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt(); // n table
            int m = sc.nextInt();// m customers
            int[] table = new int[n];
            for(int i = 0;i < n;i++){
                table[i] = sc.nextInt();// volume of a table
            }

            int[][] cus = new int[m][2];
            for(int j = 0;j < m;j++){
                cus[j][0] = sc.nextInt(); // number of customers
                cus[j][1] = sc.nextInt(); // money
            }
            Arrays.sort(table);
            Arrays.sort(cus, new Comparator<int[]>(){//通过自定义比较器实现逆序排序
                @Override
                public int compare(int[] a, int[] b){    //老师上课提问过。看到这段代码才明白
                    return b[1]-a[1]; //三种情况缩写，想起了c语言strcmp1的return (*p1 - *p2); 返回值大于0然后b[1]放在a[1]前面
                }
            });//这批人只是逆序本身预估值，按预估值来尽可能安排座位实现贪心，而非单人比值，因为一个桌子一批人
            long res = 0L;
            int index = 0;
            boolean[] tableb = new boolean[n];
            for(int i = 0;i < m;i++){
                if(cus[i][0] > table[n-1])
                    continue; //如果最大容量桌子都容不下，就执行下次循环
                index = bs(table,cus[i][0]);
                while(index < n && tableb[index] == true)
                    index++;//判断标记，一旦桌子有人就往后
                if(index < n){
                    res += cus[i][1];//累计预估资金值
                    tableb[index] = true;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
    private static int bs(int[] num, int tar){//二分法 查找合适的桌子
        int low = 0;
        int high = num.length-1;
        int mid = 0;
        while(low <= high){
            mid = (high + low)>>1;//右移操作 除2
            if(num[mid] >= tar){
                high = mid-1;
            }
                 //能容下就左边再二分查找
            else {
                low = mid+1;//容不下
            }
        }
        return low;//返回low的下标，尽可能用合适（升序）的容量去容下当前尽可能大（降序）的预估值的一批人
    }
}
