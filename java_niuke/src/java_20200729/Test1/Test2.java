package java_20200729.Test1;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/30 9:32
 */
public class Test2 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        // 利用数组进行逆置
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        int i = 0;
        int j = arrayList.size() - 1;
        for (; i < j; ) {
            int tmp = arrayList.get(i);
            arrayList.set(i, arrayList.get(j));
            arrayList.set(j, tmp);
            i++;
            j--;
        }
        return arrayList;

    }
}
