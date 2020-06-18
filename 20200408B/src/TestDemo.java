import java.lang.reflect.Field;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 23:06
 */
public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "Josvin";
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        char[] value = (char[])field.get(str);
        value[0] = 'F';
        System.out.println(str);

    }

}
