/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DoubleLinkedList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/29 15:23
 */
class ListNode {
    public int data ;
    public ListNode prev;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
    }


}

public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;
    public DoubleLinkedList() {
        ListNode head = null;
        ListNode last = null;
    }


    //头插法
    public void addFirst(int data){
        ListNode node =new ListNode(data);
        if(this.head==null) {
            this.head=node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node =new ListNode(data);
        if(this.head==null) {
            this.head=node;
            this.last = node;
        }else {
            node.prev = this.last;
            this.last.next = node;
            this.last=node;
        }

    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index<0||index>size()) {
            System.out.println("位置不合法！");
            return;
        }
        if(index==0) {
            this.addFirst(data);
            return;
        }
        if(index==size()) {
            this.addLast(data);
            return;
        }
        ListNode cur = this.head;
        while(index>0) {
            cur = cur.next;
            index--;
        }
        ListNode node = new ListNode(data);
        node.next=cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if(this.head==null) {
            return false;
        }
        ListNode cur = this.head;
        while(cur!=null ) {
            if(cur.data==key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur==this.last){
                    cur.prev.next=null;
                    this.last = cur.prev;
                    
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return ;
            }else {
                cur = cur.next;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                //当前cur是不是头结点
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next!=null) {
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }

    }
    //得到单链表的长度
    public int size(){
        ListNode cur = head;
        int count = 0;
        while(cur!=null) {
            cur = cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        ListNode cur = this.head;
        while(cur!=null) {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();

    }
    public void clear(){
        this.head=null;
        this.last=null;
    }
}
