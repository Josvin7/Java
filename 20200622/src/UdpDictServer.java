import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName UdpDictServer
 * @Description
 * @Author by房文辉
 * @Date 2020/6/22 21:12
 */
public class UdpDictServer extends UdpEchoServer {
    private Map<String, String> dict = new HashMap<>();

    public UdpDictServer(int port) throws SocketException {
        super(port);
        dict.put("cat", "小猫");
        dict.put("dog", "小gou");
        dict.put("fuck", "卧槽");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request, "这超出了我的知识范围");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer server = new UdpDictServer(9090);
        server.start();
    }
}


