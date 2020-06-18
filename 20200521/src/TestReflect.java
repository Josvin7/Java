import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestReflect
 * @Description
 * @Author by
 * @Date 2020/5/21 22:39
 */

class Cat {
    private String name = "小猫";

    public Cat() {

    }


    public Cat(String name) {
        this.name = name;
    }

    public void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }
    public void eat(String food1, String food2) {
        System.out.println(name + "正在吃" + food1 + "," + food2);
    }

}
public class TestReflect {
    //通过反射来实例化对象
    public static void testInstance() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class catClass = Class.forName("Cat");
        Cat cat = (Cat) catClass.newInstance();
    }

    //通过反射来获取对象的属性
    public static void testFiled() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class catClass = Class.forName("Cat");
        Field field = catClass.getDeclaredField("name");
        field.setAccessible(true);
        Cat cat = new Cat();
        field.set(cat, "mimi");
        String name = (String) field.get(cat);
        System.out.println(name);
    }

    public static void testMethod() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class catClass = Class.forName("Cat");
        Method method = catClass.getMethod("eat", String.class);
        method.setAccessible(true);
        Cat cat = new Cat();
        method.invoke(cat, "鱼");

    }

    public static void testConstructor() throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Class catClass = Class.forName("Cat");
        Constructor constructor = catClass.getConstructor(String.class);
        constructor.setAccessible(true);
        Cat cat = (Cat) constructor.newInstance("拾柒");
        cat.eat("苹果");
    }


    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        testFiled();
        testMethod();
    }

}
