/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/30 17:27
 */
public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addFirst(0);

        doubleLinkedList.display();
        doubleLinkedList.addIndex(0,888);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(2,888);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(2,888);
        doubleLinkedList.display();

        //doubleLinkedList.remove(3);

        doubleLinkedList.removeAllKey(3);
        doubleLinkedList.display();
        System.out.println("hello");


    }
}
