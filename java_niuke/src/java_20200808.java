/**
 * @ Created with IntelliJ IDEA.
 * @ClassName java_20200808
 * @Description
 * @Author by小房
 * @Date 2020/8/8 0:20
 */

import java.util.Scanner;

public class java_20200808 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int count = 0;
        for(int i = m; i <= n; i++){
            String s = String.valueOf(i);
            for(int j = s.length() - 1; j >= 0; j--){
                String temp = s.substring(0,j) + s.substring(j+1,s.length());
                int a = Integer.parseInt(temp);
                //System.out.println(a);
                if(isPalindrome(a)){
                    if(isPrime(a)){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
        //System.out.println(isPrime(1));

    }
    public static boolean isPalindrome(int x) {
        char[] chars=String.valueOf(x).toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<=right){
            if(chars[left++]!=chars[right--]){
                return false;
            }
        }
        return true;
    }
    //判断是不是素数
    public static boolean isPrime(int x) {
        int i = 2;
        for(;i<x;i++) {
            if (x % i == 0) {
                break;
            }
        }
        if(x == i){
            return true;
        }
        return false;
    }

}
