package com.bit.Demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Bird
 * @Description
 * @Author by房文辉
 * @Date 2020/4/3 11:18
 */
public class Bird extends Animal {
    //public String name;

    public Bird(String name) {
        //构造父类，只能调用一次，并且放在第一行         super代表父类对象的引用
        super(name);//super()代表调用父类带有一个参数的构造方法
    }

    public void fly() {
        super.eat();
        System.out.println(this.name + "正在飞");
    }
   /* public void eat() {
        System.out.println(this.name + "正在吃！");
    }*/

}
