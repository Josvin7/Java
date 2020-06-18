import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName BrokenKeyboard
 * @Description
 * @Author by房文辉
 * @Date 2020/5/13 13:13
 */
public class BrokenKeyboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while ( (scanner.hasNext())) {
            String expected  = scanner.next();
            String actual = scanner.next();

            expected = expected.toUpperCase();
            actual = actual.toUpperCase();

            Set<Character> setActual = new HashSet<>();
            for (int i = 0; i < actual.length(); i++) {
                setActual.add(actual.charAt(i));

            }
            Set<Character> brokenKey = new HashSet<>();
            for (int i = 0; i < expected.length(); i++) {
                char c = expected.charAt(i);
                if (setActual.contains(c)) {
                    continue;
                }
                if (brokenKey.contains(c)) {
                    continue;
                }
                System.out.println(c);
                brokenKey.add(c);
            }

            System.out.println();
        }
    }
}
