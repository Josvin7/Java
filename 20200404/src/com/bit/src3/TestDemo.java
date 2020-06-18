package com.bit.src3;


/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/4 22:05
 */

/**
 * 接口注意事项：
 * 1、interface关键字修饰
 * 2、里面的数据成员必须是一个常量.
 *     public  static  final  int a = 10;
 * 3、里面的成员方法是默认为：public abstract
 * 4、在接口当中 不能够定义一个已经实现的方法。
 * 5、JDK1.8新特性：接口当中可以有实现的方法 但是这个方法一定是被default修饰的
 * 6、类和接口的关系：实现--》implements  可以实现多个接口
 * 7、解决了java当中 单继承的问题  可以变为多继承
 * 8、实现了改接口  一定要重写该接口当中的方法
 * 9、接口仍然是不可以被实例化的
 * 10、实现该接口的重写方法的时候，一定不能够省略public
 */
/*
abstract class Shape {
    public abstract void Draw();//抽象方法
}
*/
interface IShape {
    public static int a = 10;
    public  abstract void Draw();//有多少抽象方法，那么就得重写多少抽象方法
}
interface A {

}
//多个接口
class Cycle implements IShape,A {
    @Override
    public void Draw() {
        System.out.println("矩形");
    }
}
class Rect implements IShape{
    @Override
    public void Draw() {
        System.out.println("这是一个矩形！");
    }
}
class Flower implements IShape {

    @Override
    public void Draw() {
        System.out.println("我想画一朵❀！");
    }
}
public class TestDemo {
    public static void drawFun(IShape shape) {
        shape.Draw();

    }
    public static void main(String[] args) {
        IShape shape = new Cycle();
        IShape shape1 = new Flower();
        IShape shape2 = new Rect();
        drawFun(shape);
        drawFun(shape1);
        drawFun(shape2);

    }
}
