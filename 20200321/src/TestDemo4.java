/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo4
 * @Description    设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象
 * @Author by房文辉
 * @Date 2020/3/21 21:03
 */
    class Test {
    private String name;
    private String city;
    private int age;

    public Test() {
        System.out.println("Test()");
    }

    public Test(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    {
        this.age=21;
        this.city="wse";
        this.name="asd";
    }
    public void show() {
        System.out.println("姓名: "+name+"城市："+city+"年龄： "+age);
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }


}
public class TestDemo4 {

    public static void main(String[] args) {
        Test test = new Test("Josvin","xian",23);
        test.show();
        new Test().show();
        String s=new Test().toString();
        System.out.println(s);
    }
}
