import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestList
 * @Description
 * @Author by房文辉
 * @Date 2020/4/11 22:59
 */
public class TestList {
    public static void main(String[] args) {
        //实例化一个list
        List<String> list = new ArrayList<>();
        //新增元素
        list.add("数据结构");
        list.add("信号检测与估值");
        list.add("数字信号处理");
        list.add("FPGA设计");
        list.add("学术英语");
        list.add("图像处理");
        //打印整个list
        System.out.println(list);
        //使用下标访问
        // [注意] 如果当前 List 是 ArrayList, get/set 按下标访问的方式, 是比较高效的(时间复杂度是 O(1));
        // 如果当前 List 是 LinkedList, get/set 按下标访问就比较低效. 时间复杂度是 O(N).
        System.out.println(list.get(2));
        //修改
        list.set(1,"自然辩证法");
        System.out.println(list);
        //截取部分内容
        System.out.println(list.subList(1,2));
        //重新构造（浅拷贝）
        List<String > arrayList = new ArrayList<>(list);
        List<String> linkedList = new LinkedList<>(list);
        System.out.println(arrayList);
        System.out.println(linkedList);
        //强制类型转换
        ArrayList<String> arrayList1 = (ArrayList<String>) list;
        LinkedList<String> linkedList1 = (LinkedList<String>) linkedList;
        System.out.println(arrayList1);
        System.out.println(linkedList1);
    }
}
