/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/28 21:09
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinedList myLinedList = new MyLinedList();
        myLinedList.addLast(20);
        myLinedList.addLast(23);
        myLinedList.addLast(23);
        myLinedList.addLast(40);
        myLinedList.addLast(40);
        myLinedList.display();


        myLinedList.deleteDuplication();
        myLinedList.display();


    }

    public static void createCut(Node headA, Node headB) {
        headA.next = headB.next.next;
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) {
            return null;
        }
        Node lenL = headA;
      Node lenS = headB;
      int countA =0;
      int countB = 0;
      int len=0;
      while(lenL!=null) {
          lenL=lenL.next;
          countA++;
      }
        while(lenS!=null) {
            lenS=lenS.next;
            countB++;
        }
      if(countA<countB) {
          lenL=headB;
          lenS=headA;
          len=countB-countA;
      }else{
          lenL=headA;
          lenS=headB;
          len=countA-countB;
      }
      while (len>0) {
          lenL=lenL.next;
          len--;
      }
      while(lenL!=null&&lenS!=null) {
          if(lenL==lenS) {
              return lenL;
          }
          lenL=lenL.next;
          lenS=lenS.next;
      }
      return null;
    }
}
