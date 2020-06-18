import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test3
 * @Description
 * @Author by
 * @Date 2020/6/16 23:40
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //文件读取路径
        FileReader filereader = new FileReader("F:/javacode/test.V");
        BufferedReader bufferedReader = new BufferedReader(filereader);
        FileWriter fileWriter = null;
        String tempString = null;
        //文件写入路径
        fileWriter = new FileWriter("F:/javacode/test3.V");
        while ((tempString = bufferedReader.readLine()) != null) {
            if(tempString.length() > 8 && tempString.charAt(8) == '.') {
                String str1=tempString.substring(9, tempString.indexOf("("));
                int beg = tempString.lastIndexOf("Signal");
                int end = tempString.indexOf(")");
                String str2 = tempString.substring((beg+7), end);
                fileWriter.write(str1 +" " +str2 + "\r\n");
            }
        }
        fileWriter.close();
        // 用完要关闭, 注意关闭顺序
        bufferedReader.close();
        filereader.close();

    }
}
