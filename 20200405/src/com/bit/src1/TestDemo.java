package com.bit.src1;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description   Cloneable接口
 * @Author by房文辉
 * @Date 2020/4/5 13:30
 */
 /*为什么Cloneable接口是一个空接口？
         空接口：标志接口--》如果一个类 实现了Cloneable接口 代表
         这个类可以被克隆。*/
class Money implements Cloneable{
    public int money = 20;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable{
    public int age;
    public Money m;
    public Person(int age) {
        this.age = age;
        m = new Money();
    }


    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person1 = (Person) super.clone();
        person1.m = (Money) this.m.clone();
        return person1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(20);
        Person person1 = (Person) person.clone();


        System.out.println(person.m.money);
        System.out.println(person1.m.money);
        System.out.println("========================");
        person1.m.money = 222;
        System.out.println(person.m.money);
        System.out.println(person1.m.money);

    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person(20);
        Person person1 = (Person) person.clone();
        System.out.println(person.age);
        System.out.println(person1.age);
        System.out.println("===================");
        person1.age = 999;

        System.out.println(person.age);
        System.out.println(person1.age);

    }
}
