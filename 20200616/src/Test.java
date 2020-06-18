import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test
 * @Description
 * @Author by房文辉
 * @Date 2020/6/16 22:00
 */
public class Test {
    public static void main(String[] args) throws IOException {
        extract("F:/javacode/小树林.png","F:/javacode/小树林2.png");
    }

    private static void extract(String srcPath, String destPath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(srcPath);
        FileOutputStream fileOutputStream = new FileOutputStream(destPath);
        byte[] buffer = new byte[1024];
        int len = -1;
        while((len = fileInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, len);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
