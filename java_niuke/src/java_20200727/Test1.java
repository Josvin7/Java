package java_20200727;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/7/27 23:09
 */
public class Test1 {
    public int JumpFloor(int target) {
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        return  JumpFloor(target-1) + JumpFloor(target-2);

    }
}
