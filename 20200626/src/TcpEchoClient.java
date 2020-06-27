import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TcpEchoClient
 * @Description
 * @Author by房文辉
 * @Date 2020/6/27 18:10
 */
public class TcpEchoClient {
    // 1、启动客户端（一定不要绑定端口号）和服务器建立连接
    // 2、进入主循环
    //  a） 读取用户输入内容
    //  b） 构造一个请求发送给服务器
    //  c） 读取服务器的响应数据
    //  d） 把响应数据显示到界面
    private Socket socket = null;

    public TcpEchoClient(String serverIP, int serverPort) throws IOException {
        // 此处的实例化 Socket 过程， 就是建立Tcp连接
        socket = new Socket(serverIP, serverPort);
    }

    public void start() {
        System.out.println(" 客户端启动 ");
        Scanner scanner = new Scanner(System.in);
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            while(true) {
                // 1、读取用户输入内容
                System.out.println("->");
                String request = scanner.nextLine();
                if("exit".equals(request)) {
                    break;
                }
                // 2、构造请求并发送。此处的换行是为了和服务器中的readLine 相对应
                bufferedWriter.write(request + "\n");
                bufferedWriter.flush();
                // 3、读取相应数据
                 String response = bufferedReader.readLine();
                 //4、把响应数据显示到界面
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient client = new TcpEchoClient("127.0.0.1", 9000);
        client.start();
    }
}
