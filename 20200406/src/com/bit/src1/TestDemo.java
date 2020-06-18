package com.bit.src1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description   异常
 * @Author by房文辉
 * @Date 2020/4/6 12:31
 */
class Person implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class TestDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(n);
        } catch (InputMismatchException e) {
            System.out.println("shuyibupipei");
        }
    }




    public static int  func() {
        try {
            int[] array = {1,2,3,4};
            return array[1];
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获了ArrayIndexOutOfBoundsExceptionn异常！");
        }finally {
            System.out.println("finally被执行！");
            return 123;
        }
    }
    public static void main4(String[] args) {
        System.out.println(func());

    }
    public static void main3(String[] args) {
        try {
            int[] array = {1,2,3,4};
            System.out.println(array[1]);
            System.out.println("after");
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获了NullPointerException异常！");
        }finally {
            System.out.println("finally被执行！");
        }
        System.out.println("=====异常处理完======");

    }



    public static void main2(String[] args) {
        try {
            int[] array = null;
            System.out.println(array.length);
        }catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获了NullPointerException异常！");
            e.printStackTrace();

        }
        System.out.println("==============");
    }
    public static void main1(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        Person person1 = (Person) person.clone();
    }
}
