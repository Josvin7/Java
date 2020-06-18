package com.bit.src2;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description  yichangdenglu
 * @Author by房文辉
 * @Date 2020/4/5 23:05
 */
class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

class UserException extends Exception {

    public UserException(String message) {
        super(message);
    }
}
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}
public class TestDemo {
    private static String userName = "Josvin";
    private static String password = "123456";

    public static void login(String userName ,String password) throws  PasswordException, UserException {
        if(!TestDemo.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if(!TestDemo.password.equals(password)) {
            throw new PasswordException("密码错误！");
        }
        System.out.println("登录成功！");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        try{
            login(name,password);
        }catch (UserException | PasswordException User) {
            User.printStackTrace();
        }
    }
}
