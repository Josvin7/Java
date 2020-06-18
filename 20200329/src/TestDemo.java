/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/29 14:56
 */
public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(1);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(3);
        doubleLinkedList.addLast(4);
        doubleLinkedList.addLast(15);
        doubleLinkedList.addFirst(0);

        doubleLinkedList.display();
        doubleLinkedList.addIndex(0,888);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(3,888);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(8,888);
        doubleLinkedList.display();

        doubleLinkedList.removeAllKey(888);
        doubleLinkedList.display();


        doubleLinkedList.clear();
        System.out.println("hello");












    }












    public static void main1(String[] args) {
        MyLinedList myLinedList = new MyLinedList();
        myLinedList.addLast(1);
        myLinedList.addLast(2);
        myLinedList.addLast(3);
        myLinedList.addLast(5);
        myLinedList.addLast(6);
        myLinedList.display();

        MyLinedList myLinedList2 = new MyLinedList();
        myLinedList2.addLast(1);
        myLinedList2.addLast(5);
        myLinedList2.addLast(12);
        myLinedList2.addLast(31);
        myLinedList2.addLast(45);
        myLinedList2.addLast(81);
        myLinedList2.addLast(88);
        myLinedList2.display();


    }
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp =  newHead;
        //1、当两个单链表都不为空的时候
        while(headA!=null&&headB!=null) {
            if(headA.data<headB.data) {
                tmp.next=headA;
                headA=headA.next;
                tmp=tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        //2、第一步完成后   其中一个单链表不为空  一个为空
        if(headA==null) {
            tmp.next=headB;
        }
        if(headB==null) {
            tmp.next=headA;
        }
        return newHead.next;
    }
}