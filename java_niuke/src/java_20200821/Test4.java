package java_20200821;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test4
 * @Description
 * @Author by小房
 * @Date 2020/8/21 20:43
 */
public class Test4 {



    public static void main(String[] args) {

        int[] array = new int[5];

        print(5, array, -1);



    }



    public static void print(int n, int[] array, int end) {



//在n=1,n=0时，表明array里面已经保存了所有要打印的数字了。这时候就可以开始打印，不过考虑到重复的情况，如果不是递减的就不输出；

        if (n == 0) {

            for (int i = 1; i <= end; i++) {

                if(array[i-1]<array[i]){

                    return ;

                }

            }

            for (int i = 0; i <= end; i++) {

                System.out.print(array[i] + " ");

            }

            System.out.println();

            return;

        }

        if (n == 1) {



            array[++end] = 1;

            for (int i = 1; i <= end; i++) {

                if(array[i-1]<array[i]){

                    return ;

                }

            }


            for (int i = 0; i <= end; i++) {

                System.out.print(array[i] + " ");

            }

            System.out.println();

            return;

        }

//核心的递归循环代码，对于N>1的情况，分别对end的各种情况进行赋值，直到变为0；

        for (int i = n; i > 0; i--) {

            array[++end] = i;

            print(n - i, array, end);

            end--;

        }



    }

}