package java_20200806;

import java.util.*;
public class Test{
    public static void main(String[] args){
        int[][] x = new int[3][];
        try(Scanner in = new Scanner(System.in)){
            System.out.println(helper(in.nextInt(),in.nextInt()));
        }
    }
    public static int helper(int l,int r){

        int count = 0;
        if(l == 1) {
            l++;//1不是素数
        }
        while(l <= r){
            String str = String.valueOf(l);
            for (int i = 0; i < str.length() ; i++) {
                if(isHuiWen(l) && isSu(l)) {
                    count++;
                    break;
                }
                for (int j = 0; j < str.length() ; j++) {
                    int ans = toDelOne(str, i);
                    if(isHuiWen(ans) && isSu(ans)) {
                        count++;
                        break;
                    }
                }

                //System.out.println(ans);

            }
            l++;
        }
        return count;
    }

    private static int toDelOne(String str, int i) {
        int num = Integer.parseInt(str);
        int ans = (int) (num/Math.pow(10,i)*Math.pow(10,i) + num%Math.pow(10,i));
        return ans;
    }

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