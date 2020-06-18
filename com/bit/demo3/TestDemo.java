package com.bit.demo3;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GAOBO
 * Date: 2020-04-02
 * Time: 19:27
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
 * 面试问题：
 *     抽象类和普通类的区别？
 */
abstract class Shape {
    //可以拥有普通类的数据成员 或者 方法
    public abstract void draw();//抽象方法：没有具体实现的方法

}

abstract class B extends Shape {

}
/*class C extends B {
    //这里必须要重写   出来混 迟早要还的
}*/

class A extends Shape{
    @Override
    public void draw() {
        System.out.println("fsfsfas");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("这是一个圆！");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("这是一个矩形！");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("我想画一朵❀！");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}

public class TestDemo {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        //也可以发生向上转型
        Shape shape1 = new Cycle();
        Shape shape2 = new Rect();
        Shape shape3 = new Flower();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
}
