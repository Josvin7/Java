package com.bit.Demo;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Animal
 * @Description
 * @Author by房文辉
 * @Date 2020/4/3 11:14
 */
public class Animal {
    public String name;
    protected String sex;
    int count;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(this.name + "正在吃！");
    }


}
