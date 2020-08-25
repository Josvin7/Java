package java_20200823;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/8/23 20:33
 */
//节点
class Node{
    public int value;
    public Node next;
    public Node(int data) {
        this.value = data;
    }
}

public class Test1 {
    public Node removeLastKthNode(Node head, int K) {
        if (head == null || K < 1)
            return head;
        Node temp = head;
        int num = 0;
        while (temp != null) {
            num++;
            temp = temp.next;
        }
        if (num == K) {
            return head.next;
        }
        if (num > K) {
            temp = head;
            //删除第(num-k+1)个节点
            //定位到这个点的前驱
            while (num - K != 0) {
                temp = temp.next;
                num--;
            }
            temp.next = temp.next.next;
        }
        return head;
    }


}