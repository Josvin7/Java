/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyLinedList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/28 21:12
 */
class Node {
    public int data;
    public Node next;
    public  Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinedList {
    public  Node head;
    public MyLinedList() {
        this.head=null;
    }
    public void addFirst(int data){
        Node node = new Node(data);
        if(this.head == null) {
            //第一次插入节点
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法  O(n)
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next!= null) {
            cur = cur.next;
        }
        //cur指向的节点就是尾巴
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size() ) {
            throw new RuntimeException("index位置不合法");
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        //1、让一个引用  先走index-1 步
        Node prev = findIndex(index);
        //2、先绑后面
        Node node = new Node(data);
        node.next = prev.next;
        prev.next = node;
    }
    //走index-1步
    private Node findIndex(int index) {
        Node cur = this.head;
        int count = 0;
        while (count < index-1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 找到关键字key 的前驱
     * @param key
     * @return
     */
    private Node findPrev(int key) {
        Node prev = this.head;
        while (prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(key);
        if(prev == null) {
            System.out.println("没有这个节点！");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node prev = this.head;
        //代表要删除的节点
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display(){
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void display2(Node newHead){
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        //this.head = null;
        while (this.head.next!=null) {
            Node del = this.head.next;
            this.head.next = del.next;
        }
        this.head = null;
    }


    public Node reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node findKthToTail(int k) {
        if(k <= 0 || this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        //1、让fast先走k-1步
        while (k-1 > 0) {
            if(fast.next != null) {
                fast = fast.next;
                k--;
            }else {
                System.out.println("没有改节点!");
                return null;
            }
        }
        //2、让两个引用 一起走  直到 fast.next == null
        // slow 所指的位置就是倒数第K个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node partition(int x) {
        Node bs = null;
        Node be = null;//永远指向尾巴的地方
        Node as = null;
        Node ae = null;
        Node cur = this.head;
        while (cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    //第一个线段的第一次插入
                    bs = cur;
                    be = bs;
                }else {
                    be.next = cur;
                    be = be.next;
                }
            }else {
                if(as == null) {
                    //第一个线段的第一次插入
                    as = cur;
                    ae = as;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        //第一个段没有数据
        if(bs == null) {
            //只能返回第二个段
            return as;
        }
        //代码走到这里 说明bs !=null  那么把两个段拼接起来
        be.next = as;
        //只要第二个段 不为空
        if(as != null) {
            ae.next = null;
        }
        return bs;
    }
    //删除重复元素，并不保留重复元素
    public Node deleteDuplication(){
        Node node = new Node(-1);
        Node prev = node;
        Node cur = this.head;
        while(cur!=null) {
            if (cur.next != null && cur.data == cur.next.data) {
                //一定要注意顺序！！！！！！！！！！！！！！！！！！！！！！！！！！！！
                while (cur.next != null&&cur.data == cur.next.data ) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                prev.next = cur;
                prev = prev.next;
                cur=cur.next;
            }
        }
        prev.next=null;
        return node.next;
    }
    //回文结构
    public boolean chkPalindrome() {
        Node fast = head;
        Node slow = head;
        while(fast!=null) {
            fast= fast.next.next;
            slow = slow.next;
        }
        Node cur = slow.next;
        while(cur!=null) {
            Node curN = cur.next;
            cur.next=slow;
            slow=cur;
            cur = curN;
        }

        while(slow!=head) {
            if(slow.data!=this.head.data) {
                return false;
            }
//偶数情况
            if(slow==this.head.next) {
                return true;
            }
            slow=slow.next;
            this.head=this.head.next;
        }
        return true;
    }
    public void createLoop() {
        Node cur = this.head;
        while(cur!=null) {
            cur = cur.next;
        }
        cur.next = this.head.next.next.next.next;
    }
    //判断是否有环
    public boolean hasCycle() {
        if(this.head==null) {
            return false;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow!=null&&fast==slow) {
                return true;
            }
        }
        return  false;
    }
    //链表入环的第一个节点
    public Node detectCycle() {
        if(this.head==null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        while (fast!=null&&fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
            if(slow!=null&&fast==slow) {
                break;
            }
        }
        if(fast==null||fast.next==null) {
            return null;
        }
        fast = this.head;
        while(fast!=slow) {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }



}
