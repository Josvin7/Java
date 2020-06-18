package com.bit.src4;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description   接口
 *  将功能进行独立
 *  接口是不能被接口实现的
 *  接口和接口之前可以通过extends进行联系
 *  一个接口可以extends多个接口
 * @Author by房
 * @Date 2020/4/4 22:32
 */
interface A {
    void func1();
}
//extends  扩展
interface B extends A{
    void func2();
}

interface C extends B{
    void func3();
}
class AAA implements A {

    @Override
    public void func1() {

    }
}
class BBB implements C {

    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }

    @Override
    public void func3() {

    }
}


//=====================================================================
class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}

interface IFlying {
    void fly();
}

interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}

//一个类  可以继承一个类 并且同时 实现多个接口
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
//实现多个接口
class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}
class Robot implements IRunning{

    @Override
    public void run() {
        System.out.println("机器人会跑！");
    }
}
public class TestDemo{
    public static void walk(IRunning iRunning) {
        iRunning.run();

    }

    public static void swim(ISwimming iSwimming) {
        iSwimming.swim();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("17");
        walk(cat);
        Frog frog = new Frog("18");
        walk(frog);

        swim(frog);

    }
}
