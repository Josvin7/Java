/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ComparTo
 * @Description
 * @Author by房文辉
 * @Date 2020/4/8 23:53
 */
public class ComparTo {
    public static void main(String[] args) {
        String str1 = "asdf";
        String str2 = "asdr";
        int length = str1.length();
        if(str2.length()>str1.length()) {
            length = str2.length();
        }
        for (int i = 0; i < length; i++) {
            if(str1.charAt(i)!=str2.charAt(i)) {
                System.out.println(str1.charAt(i)-str2.charAt(i));
                 return;
            }
        }
        System.out.println(0);
    }
}
