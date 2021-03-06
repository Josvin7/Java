/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description static关键字
 * @Author by房文辉
 * @Date 2020/3/20 19:19
 */
class Test{
    public int a;//普通成员变量  0
    public static int count;//静态成员变量 在内存的方法区当中  只有一份
}
public class TestDemo1 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);//1
        System.out.println(Test.count);//1
        System.out.println("============");
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
}
