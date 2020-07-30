package java_20200729.Test1;

import java.util.ArrayList;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description
 * @Author by小房
 * @Date 2020/7/30 9:43
 */
public class Test3 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    // 递归
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        printListFromTailToHeadHelper(arrayList,listNode);
       return arrayList;

    }

    private void printListFromTailToHeadHelper(ArrayList<Integer> arrayList, ListNode listNode) {
        if (listNode == null) {
            return;
        }
        printListFromTailToHeadHelper(arrayList, listNode.next);
        arrayList.add(listNode.val);
    }

}
