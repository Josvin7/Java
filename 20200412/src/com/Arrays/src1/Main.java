package com.Arrays.src1;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Main
 * @Description
 * @Author by房文辉
 * @Date 2020/4/12 10:46
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,20);
        myArrayList.add(2,30);
        myArrayList.add(3,40);
        myArrayList.display();
        myArrayList.remove(12);
        myArrayList.add(2,99);
        myArrayList.display();
        myArrayList.removeNum(0);
        myArrayList.display();
        System.out.println(myArrayList.getPos(3));


    }
}
