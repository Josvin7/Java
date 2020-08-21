package java_20200821;

//这篇文章缺少必要的注释，如果有看不懂的地方请写下评论
import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();// n 张桌子
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {  //每个桌承 受人数
            a[i]=in.nextInt();
        }
        System.out.println(dic(4, a));
    }
    public static int dic(int num,int[] a){
        int left=0;
        int right=a.length-1;
        int mid=0;
        while(left<=right){
            mid=(right+left)>>1; //二分
            if(num<=a[mid]){ // 这个要小于等于才能找到最左边的，例如找到了num==a[mid],那么还
                right=mid-1; // 继续二分，继续找左边的，直到找到最坐标的
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}