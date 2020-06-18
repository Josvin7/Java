/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyLinedList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/26 20:27
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
        if(this.head == null) {
            this.head = node;
            return;
        }
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
    public void display(Node newHead) {
        Node cur = newHead;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void display2() {
        Node cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear() {
        this.head = null;
    }
    public Node FindKthToTail(int k) {
        if(k <= 0 || this.head==null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        //1、让fast先走k-1步
        while(k-1!=0) {
            fast = fast.next;
            if(fast==null) {
                return  null;
            }
            k--;
        }
        //2、让两个引用 一起走  直到 fast.next == null
        // slow 所指的位置就是倒数第K个节点
        while (fast.next == null) {
            fast=fast.next;
            slow=slow.next;
        }
        return  slow;
    }
    public Node reverseList2() {
            Node first = null;
            while(this.head!=null){
                Node result = new Node(this.head.data);
                result.next = first;
                first = result;
                this.head = this.head.next;
            }
            return first;
        }


       public Node reverseList() {
        if(this.head==null) {
            return null;
        }
        Node prev = this.head;
        Node cur = prev.next;
        this.head.next=null;
        Node newHead = null;
        while(cur!=null) {
            Node curN = cur.next;
            cur.next=prev;
            prev=cur;
            cur=curN;
        }
        newHead=prev;
        return newHead;
    }

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return  slow;
    }


    public Node partition( int x) {
        Node pe = null;
        Node ps = null;
        Node ae = null;
        Node as = null;
        Node cur = this.head;
        while(cur!=null) {
            if(cur.data<x) {
                if(ps==null) {
                    ps=cur;
                    pe=ps;
                }else{
                    pe.next=cur;
                    pe=pe.next;
                }
            }else{
                if(as==null) {
                    as=cur;
                    ae=as;
                }else{
                    ae.next=cur;
                    ae=ae.next;
                }
            }
            cur=cur.next;
        }
        if(ps==null) {
            return as;
        }
        pe.next=as;
        ae.next=null;
        return ps;
    }
}

