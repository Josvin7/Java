/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/26 18:31
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinedList myLinedList = new MyLinedList();

        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(23);
        myLinedList.addLast(5);
        myLinedList.display2();
        Node newHead = myLinedList.reverseList();
        myLinedList.display(newHead);


        //Node newHead=myLinedList.partition(4);

        //myLinedList.display(newHead);

    }
}
