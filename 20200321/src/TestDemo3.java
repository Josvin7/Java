
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo3
 * @Description
 *
 * 编写一个类Calculator, 有两个属性num1, num2, 这两个数据的值，不能在定义的同时初始化，最后实现加减乘除四种运算
 *
 * @Author by房文辉
 * @Date 2020/3/21 20:31
 */
class Calculator {
    private double num1;
    private double num2;
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1+num2;
    }
    public double sub() {
        return num1-num2;
    }
    public double mul() {
        return num1*num2;
    }
    public double div() {
        return num1/num2;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        Calculator cal = new Calculator(a,b);
        System.out.println(cal.add());
        System.out.println(cal.div());
        System.out.println(cal.mul());
        System.out.println(cal.sub());
}
}
