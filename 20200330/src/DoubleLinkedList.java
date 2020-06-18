/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DoubleLinkedList
 * @Description  双向链表练习
 * @Author by房文辉
 * @Date 2020/3/30 17:28
 */
class Node {
    public int data ;
    public Node prev;
    public Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class DoubleLinkedList {
    public Node head;
    public Node last;
    public DoubleLinkedList() {
        Node head = null;
        Node last = null;
    }
    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head==null) {
            this.head = node;
            this.last = node;
        }else {
            Node cur = this.head;
           node.next = this.head;
           cur.prev = node;
           this.head = node;

        }
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head==null) {
            this.head = node;
            this.last = node;
        }else {
            Node cur = this.last;
            node.prev = this.last;
            cur.next = node;
            this.last = node;
        }


    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index==0) {
            addFirst(data);
            return;
        }
        if(index==size()) {
            addLast(data);
            return;
        }
        if(index<0||index>size()) {
            System.out.println("插入位置不合法！！！！");
            return;
        }
        Node cur = this.head;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        Node node = new Node(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        Node cur = this.head;
        while(cur!=null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            while(cur.data!=key) {
                cur=cur.next;
            }
            if(cur==this.head) {
                this.head = this.head.next;
                this.head.prev = null;
                return;
            }else if(cur==this.last) {
                cur.prev.next = null;
                return;
            }else{
                cur.next.prev = cur.prev;
                cur.prev.next = cur.next;
                return;
            }
        }
        return;



    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            while(cur.data!=key) {
                cur=cur.next;
            }
            if(cur==this.head) {
                this.head = this.head.next;
                this.head.prev = null;

            }else if(cur==this.last) {
                cur.prev.next = null;

            }else{
                cur.next.prev = cur.prev;
                cur.prev.next = cur.next;

            }
            cur = cur.next;
        }



    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while(cur!=null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void display() {
        if(this.head==null) {
            return;
        }
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
        this.head = null;
        this.last = null;

    }
}
