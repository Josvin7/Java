package com.bit.user;

import com.bit.book.BookList;
import com.bit.operation.*;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName User
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:29
 */
abstract public class User {


    public String name;
    public IOperation[] Operations;

    public User(String name) {
        this.name = name;
    }

    //如果没有这个方法，子类不能通过user.访问
    public abstract int menu();//抽象类

    public void doOperation(int choice, BookList bookList) {
        //Operations[choice]  ==》拿到的是数组当中元素的对象
        //Operations[choice].work(bookList) 通过.号  调用对应的操作方法
        Operations[choice].work(bookList);


    }
}
