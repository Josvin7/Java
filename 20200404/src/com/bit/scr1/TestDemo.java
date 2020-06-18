package com.bit.scr1;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/4 17:58
 */
class Base {
    public int a;
    static {
        System.out.println("Base:  static {}");
    }
    {
        System.out.println("Base:  {}");
    }

    public Base(int a) {
        this.a = a;
        System.out.println("Base(int )");
    }
    public void func() {
        System.out.println("Base :  func()");
    }

}
class Drive extends Base {
    static {
        System.out.println("Drive: static{}");
    }
    {
        System.out.println("Drive: {}");
    }
    public void func() {
        System.out.println("Drive:  func()");
    }
    public Drive(int a) {
        super(a);
        System.out.println("Drive:  (int)");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Drive drive = new Drive(10);
        System.out.println("===================");
        Drive drive1 = new Drive(20);
    }
    public static void main1(String[] args) {
        Base base = new Drive(10);
        System.out.println("===================");
        Base base1 = new Drive(20);
    }
}
