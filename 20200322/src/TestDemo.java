/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/22 12:36
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,10);
        myArrayList.add(1,20);
        myArrayList.add(2,30);
        myArrayList.add(3,40);
        myArrayList.display();
        myArrayList.remove(12);
        myArrayList.add(2,99);
        myArrayList.display();

    }

}
