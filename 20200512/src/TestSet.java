import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestSet
 * @Description
 * @Author by房文辉
 * @Date 2020/5/12 22:59
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("郭玉莹");
        set.add("郭玉莹");
        set.add("郭玉莹");
        set.add("郭玉莹");
        set.add("拾柒");
        set.add("十一");
        set.add("十三");
        System.out.println(set.contains("十一"));
        set.remove("郭玉莹");

        System.out.println(set);

        for (String s: set
             ) {
            System.out.println(s);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
