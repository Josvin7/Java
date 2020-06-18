package com.bit.user;

import com.bit.operation.*;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName AdminUser
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:29
 */
public class AdminUser extends User {

    public AdminUser(String name) {
        super(name);
        //这个数组当中  保存 每个对象对应的操作
        this.Operations = new IOperation[] {
                    new ExitOperation(),
                    new FindOperation(),
                    new AddOperation(),
                    new DelOperation(),
                    new DisplayOperation()

            };
    }

    public int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello "+ this.name +" 欢迎来到Java16班图书系统");
        System.out.println("1、查找图书");
        System.out.println("2、新增图书");
        System.out.println("3、删除图书");
        System.out.println("4、打印图书");
        System.out.println("0、退出系统");

        int choice = scanner.nextInt();
        return choice;
    }

}
