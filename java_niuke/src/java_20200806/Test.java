package java_20200806;

import java.util.*;
public class Test{
    public static void main(String[] args){
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
            int tmp1 = l / 10;
            String str = String.valueOf(l);
            int len = str.length();
            if(len/2 != 0) {
                str = str.substring(0,len/2) + str.substring(len/2, len);
            }
            int tmp2 = Integer.parseInt(str);
            if(isHuiWen(l) && isSu(l)) {
                count++;
            }else if (isHuiWen(tmp1) && isSu(tmp1)){
                count++;
            } else if(isHuiWen(tmp2) && isSu(tmp2)){
                count++;
            }
            l++;
        }
        return count;
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