package java_20200728;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/7/28 23:19
 */
public class Test1 {
    public int NumberOf1(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n--;
        }
        return count;
    }
}
