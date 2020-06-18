/**
 * @ Created with IntelliJ IDEA.
 * @ClassName HomeWork1
 * @Description
 * @Author by房文辉
 * @Date 2020/3/28 19:03
 */
public class HomeWork1 {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0,10);
        seqList.add(1,20);
        seqList.add(2,30);
        seqList.add(2,40);
        seqList.setPos(3,50);
        seqList.display();
        seqList.remove(10);
        seqList.display();

    }
}
