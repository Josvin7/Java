import java.util.ArrayList;
import java.lang.String;
import  java.lang.Integer;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyArrayList
 * @Description
 * @Author by房文辉
 * @Date 2020/4/11 23:22
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("数据结构");
        arrayList.add("Java");
        arrayList.add("C语言");
        arrayList.add("PHP");
        arrayList.add("GO");
        System.out.println(arrayList);
        arrayList.add(2,34);
        System.out.println(arrayList);
        ///.addAll()
        boolean res = arrayList.contains("Java");
        System.out.println(res);


        //String ans = (String) arrayList.get(2);
        Object ans1 = arrayList.get(2);


        System.out.println(ans1);

        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.set(2,"学术英语");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList);




    }
}
