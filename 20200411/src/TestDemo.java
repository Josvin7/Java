/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/11 22:35
 */
class A<T> {
    public A(T value) {
        this.value = value;
    }

    T value;



    T get() {
        return value;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        A<String> a = new A<>("wee");
        System.out.println(a.get());


    }


}
