package java_20200807;


import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(helper(in.nextInt(), in.nextInt()));
        //*这个代码可以检验删数的结果
       /* String str = String.valueOf(in.nextInt());
        for (int i = 0; i < str.length(); i++) {
            int ans = toDelOne(str, i);
            System.out.println(ans);
        }*/
    }

    public static int helper(int l, int r) {
        int count = 0;
        while (l < r) {
            String str = String.valueOf(l);
            for (int i = 0; i < str.length(); i++) {
                int ans = toDelOne(str, i);
                //注意1的判断
                if (l != 1 && isHuiWen(l) && isSu(l)) {
                    count++;
                    //System.out.println(l);
                    break;
                } else if (ans > 1 && isHuiWen(ans) && isSu(ans)) {
                    count++;
                    //System.out.println(ans);
                    break;
                }
            }
            l++;
        }
        return count;
    }
    //删除str的第i位
    private static int toDelOne(String str, int i) {
        int num = Integer.parseInt(str);
        int ans = (int) ((int) (num/Math.pow(10,i +1 ))*Math.pow(10,i  ) + num%Math.pow(10,i  ));
        return ans;
    }
    //判断素数
    public static boolean isSu(int num){
        int i = 2;
        while(i * i <= num){
            int j = num / i;
            if(j * i  == num) {
                return false;
            }
            i++;
        }
        return true;
    }
    // 判断回文
    public static boolean isHuiWen(int num){
        char[] cs = Integer.toString(num).toCharArray();
        int i = 0,j = cs.length - 1;
        while(i <= j){
            if(cs[i] != cs[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}