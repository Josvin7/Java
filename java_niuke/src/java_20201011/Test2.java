package java_20201011;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/10/14 20:13
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(max(1,2));
    }

    public static double max(double num1, double num2 ) {
        System.out.println("max(double,double) is invoked");
        if (num1 > num2) {
            return num1;
        } else {
            return  num2;
        }
    }
    public static double max(int num1, double num2 ) {
        System.out.println("max(int,double) is invoked");
        if (num1 > num2) {
            return num1;
        } else {
            return  num2;
        }
    }
    public static double max(int num1, int num2 ) {
        System.out.println("max(int,int) is invoked");
        if (num1 > num2) {
            return num1;
        } else {
            return  num2;
        }
    }
}
