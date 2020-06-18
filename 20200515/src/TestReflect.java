import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestReflect
 * @Description
 * @Author by房文辉
 * @Date 2020/5/15 12:32
 */
class Cat {
    private String name;

    public void eat(String food) {
        System.out.println(name + "正在吃" +food);
    }

    public Cat(String name) {
        this.name = name;
    }
}
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException {
         //
       //Scanner scanner = new Scanner(System.in);
        //String name = scanner.next();
        Class catClass = Class.forName("Cat");
        //
        Cat cat = new Cat("咪咪");
        Class catClass2 = cat.getClass();
        //
        Class catClass3 = Cat.class;

        System.out.println(catClass == catClass2);
        System.out.println(catClass == catClass3);
    }
}
