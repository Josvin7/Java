package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName NormalUser
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:28
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        //普通用户的对应操作
        this.Operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello "+ this.name +" 欢迎来到Java16班图书系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0、退出系统");

        int choice = scanner.nextInt();
        return choice;
    }
}
