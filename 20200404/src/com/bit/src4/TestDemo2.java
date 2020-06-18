package com.bit.src4;

import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/4/4 22:56
 */
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        //return this.age-o.age;  从小到大
        //return this.age-o.age;
        //return this.score-o.score;
        return this.name.compareTo(o.name);//字符串的比较大小
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",10,89);
        students[1] = new Student("18",18,99);
        students[2] = new Student("17",7,20);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        Integer[] array = {18,1,8,3,8,10};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
