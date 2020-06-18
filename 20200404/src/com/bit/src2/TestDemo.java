package com.bit.src2;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description   抽象类
 * @Author by房
 * @Date 2020/4/4 21:43
 */
/**
 * 抽象类：包含抽象方法的类，我们把它叫做 抽象类
 * 1、用关键字abstract进行修饰
 * 2、在抽象类当中 可以有普通类的所有属性或者方法
 * 3、和普通的类 不一样的地方就是，包含了抽象方法。
 * 4、和普通的类 不一样的地方就是 他不能够被实例化
 *      Shape shape = new Shape();
 * 5、抽象类的主要作用就是用来被继承的
 * 6、抽象类就是用来被继承的 所以：不能被final所修饰
 *      final abstract class Shape
 * 7、抽象方法 也不能是私有的 或者是 static的
 *
 * 8、只要有一个类，继承了这个抽象类 那么 必须要重写抽象类当中的方法。
 *
 * 9、如果这个类，不想重写抽象类里面的抽象方法，
 *        那么此时这个类也可以设置为抽象类。
 *
 */
abstract class Shape {
    public abstract void Draw();//抽象方法
}
class  A extends Shape {

    @Override
    public void Draw() {
        System.out.println("==============");
    }
}
abstract class  B extends Shape {

}
class Cycle extends Shape {


    @Override
    public void Draw() {
        System.out.println("这是一个○！");
    }
}
class Rect extends Shape {
    @Override
    public void Draw() {
        System.out.println("这是一个矩形！");
    }
}
class Flower extends Shape {
    @Override
    public void Draw() {
        System.out.println("花一朵蕐");
    }
}
public class TestDemo {
    public static void drawFun(Shape shape) {
        shape.Draw();
    }
    public static void main(String[] args) {
        Shape shape = new Flower();
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        drawFun(shape);
        drawFun(shape1);
        drawFun(shape2);


    }
}
