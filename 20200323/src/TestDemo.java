/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/23 19:13
 */

public class TestDemo {
    public static void main(String[] args) {
        MyLinedList myLinedList = new MyLinedList();

        myLinedList.display();
        //myLinedList.addIndex(1,99);
        //myLinedList.remove(1);
        myLinedList.removeAllKey(1);
        //myLinedList.contains();
        myLinedList.display();

    }
}
