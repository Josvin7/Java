/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description  类和对象练习
 * @Author by房文辉
 * @Date 2020/3/20 15:22
 */
//声明一个类  Person
class A {

}
class Person {
    public static int count=19;
    public String name;
    public  int age;
    public final int SIZE = 100;
    public static  final  int SIZE2 = 1000;

    public A a;
    public void eat() {
        System.out.println("成员方法  eat");
    }
    public void sleep() {
        System.out.println("成员方法   sleep");
    }
    public void show() {
        System.out.println("姓名： "+name + "    年龄： "+age);
    }
    public static void func() {
        count++;
        //静态方法中不能访问非静态数据成员
        System.out.println(SIZE2);
    }
}
public class TestDemo {
    public static void function() {
        System.out.println("static:function()");
    }
    public static void main(String[] args) {
        //实例化一个对象，
        Person person = new Person();
        person.age =23;
        person.name ="Josvin";
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.SIZE);
        System.out.println(Person.SIZE2);
        System.out.println("Person: "+Person.count);
        //静态变量不属于对象，而是类本身；变量名访问一般会警告，我们通过类名访问！
        person.show();
        System.out.println(person.a);
        //类也是引用类型，返回的是null
        Person.func();
        function();


    }
}
