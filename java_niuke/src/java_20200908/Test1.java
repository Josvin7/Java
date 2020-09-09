package java_20200908;

import java.util.Scanner;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();// n 张桌子
            int m=in.nextInt();// m 批客人
            long max=0L;
            int[] a=new int[n];
            int[] vis=new int[n];  // 标记，查看这个桌子是否被用了，如果是就置为1
            int[][] num=new int[m][2];
            for (int i = 0; i < n; i++) {  //每个桌承 受人数
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < m; i++) {
                num[i][0]=in.nextInt();
                num[i][1]=in.nextInt();
            }
            Arrays.sort(num, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return b[1]-a[1];
                }
            });
            //System.out.println(num[]);
            for (int i = 0; i < m; i++) { //遍历m批人
                if(a[n-1]<num[i][0]){
                    continue;
                }
                int nu=num[i][0]; //人数
                int price=num[i][1]; //价值
                // 找到nu在n的位置
                int index=dic(nu,a);
                while(index<n && vis[index]==1){ //向后找到没有用的桌子
                    index++;
                }
                if(index<n){
                    max+=price;
                    vis[index]=1;
                }
            }
            System.out.println(max);
        }
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