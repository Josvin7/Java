import java.util.*;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] chars = N.toCharArray();
/**
     * list***有10个item表示0-9，每个item的值表示数字的个数
 */
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(0);//初始化每个item都是0
        }
        for (int i = 0; i < chars.length; i++) {
            // 每遇到一个数字，就把值+1
             list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }
    }

    public class Solution {
        public int[] multiply(int[] A) {
            //（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
            int len = A.length;
            int[] B = new int[len];
            for (int i = 0; i <len ; i++) {
                B[i] = 1;
                for (int j = 0; j < len ; j++) {
                    //不乘i==j的元素
                    if(j ==i && j<len) {
                        j++;
                        if (j == len) {
                            break;
                        }
                    }
                    B[i] = A[j] * B[i];
                }
            }
            return B;

        }
    }
}