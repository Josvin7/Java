package com.ZTE.src1;

import java.lang.reflect.Field;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TeatDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 23:04
 */

public class TeatDemo1 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Josvin";
        Field field = String.class.getDeclaredField("value");
        char[] value = (char[])field.get(str);
        value[0] = 'F';
        System.out.println(str);
        //str+="asd";
       // System.out.println(str);


    }

}