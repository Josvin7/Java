package com.bit.scr1;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/4/4 18:32
 */
class Shape {
    public void Draw() {

    }
}
class Cycle extends Shape {


    @Override
    public void Draw() {
        System.out.println("这是一个○！");
    }
}
class Rect extends Shape{
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
public class TestDemo2 {
    public static void drawFun(Shape shape) {
        shape.Draw();

    }

    public static void main(String[] args) {
        Shape[] shapes = {new Cycle(),new Rect(),new Flower()};
        for (Shape shape:shapes) {
            shape.Draw();
            System.out.println("=========");
            drawFun(shape);
            System.out.println("================");
        }
    }
    public static void main1(String[] args) {
        Shape shape1 = new Rect();
        shape1.Draw();
        Shape shape2 = new Cycle();
        shape2.Draw();
        System.out.println("=================");
        drawFun(shape1);
        drawFun(shape2);

    }

}
