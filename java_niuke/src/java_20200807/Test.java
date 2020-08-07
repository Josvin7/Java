package java_20200807;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = 0;
        for(int i = n;i<=m;i++){
            if(checkValid(i)) {
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
    public static boolean checkValid (int num){
        String str = String.valueOf(num);
        for(int i = 0;i<str.length();i++){
            String temp = str.substring(0,i)+str.substring(i+1);
            int left = 0;
            while(temp.charAt(left)=='0'&&left<=temp.length()-1) {
                left++;
            }
            if(left>=temp.length()) {
                continue;
            }
            String curr = temp.substring(left);
            if(isPla(curr)&& strPrime(curr)) {
                return true;
            }
        }
        return false;

    }
    public static boolean strPrime(String str){
        int num = Integer.valueOf(str);
        return isPrime(num);
    }
    public static boolean isPrime (int num){
        if(num < 2) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        int sqrt = (int) Math.sqrt(num);

        for(int i=2;i <= sqrt; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }

    public static boolean isPla(String temp){
        int left = 0;
        int right = temp.length()-1;

        if(temp.length()==1) return true;
        while(left<right){
            char a = temp.charAt(left);
            char b = temp.charAt(right);
            if(a == b){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

}