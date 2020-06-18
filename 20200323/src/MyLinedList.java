/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyLinedList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/23 19:33
 */
//节点类
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//单链表
public class MyLinedList {

    public Node head;

    public MyLinedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head==null) {
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur =this.head;
        while(cur.next!=null) {

            cur=cur.next;
        }
        cur.next=node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(index<0||index>size()) {
            return;
        }
        if(index==0) {
            node.next=this.head;
            this.head=node;
            return;
        }
        while (index-1>0) {
            cur=cur.next;
            index--;
        }
        node.next=cur.next;
        cur.next=node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur!=null) {
            if(cur.data==key) {
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //找前驱
    private  Node findPrev(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null) {
            if(cur.data==key) {
                return prev;
            }else{
                cur = cur.next;
                prev = prev.next;
            }
        }
       return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        Node cur = this.head;

        if(cur.data==key) {
            this.head=this.head.next;
            return;
        }
        Node prev=findPrev(key);
        while(cur!=null) {
            if(cur.data==key) {
                prev.next=cur.next;
                return;
            }
            cur=cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head==null) {
            return;
        }
        while(this.head.data==key) {
            this.head=this.head.next;
            if(this.head==null) {
                return;
            }
        }
        Node prev = this.head;
        Node cur = prev.next;
        while(cur!=null) {
            if(cur.data==key) {
                prev.next=cur.next;
                cur=cur.next;
            }else {
                prev=cur;
                cur=cur.next;
            }
        }
    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count =0;
        if(cur!=null) {
            cur=cur.next;
            count++;
        }
        return count;
    }
    public void display() {
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear() {


    }
}
