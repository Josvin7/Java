/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyHashMap
 * @Description
 * @Author by房文辉
 * @Date 2020/5/15 11:47
 */
public class MyHashMap {
    static class Node {
        public int key;
        public int value;
        public Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] array = new Node[101];
    private int size = 0;


    public void put(int key, int value) {
        int index = hashFunc(key);
        Node head = array[index];
        for(Node cur = head; cur != null; cur = cur.next) {
            if(cur.key == key) {
                cur.value = value;
                return;
            }
        }
        Node newNode = new Node(key, value) ;
        newNode.next = head;
        array[index] = newNode;
        size++;
    }

    private int hashFunc(int key) {
        return key % array.length;
    }

    public Integer get(int key) {
        int index = hashFunc(key);
        for (Node cur  = array[index]; cur!= null; cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return null;

    }
}
