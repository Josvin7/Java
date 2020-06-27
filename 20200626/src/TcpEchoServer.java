import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TcpEchoServer
 * @Description
 * @Author by房文辉
 * @Date 2020/6/26 22:24
 */
public class TcpEchoServer {
    //1、初始化服务器
    //2、进入主循环
    //  1）先去从内核获取一个Tcp的连接
    //  2）处理这个Tcp连接
    //    a) 读取请求并解析
    //    b) 根据请求计算响应
    //    c) 把响应写会给客户端
    private ServerSocket serverSocket = null;

    public TcpEchoServer(int port) throws IOException {
        // 这个操作和udp类似，也是要绑定端口号
        serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true) {
            //  1）先去从内核获取一个Tcp的连接
            Socket clientSocket = serverSocket.accept();
            //  2）处理这个Tcp连接
            processConnection(clientSocket);
        }
    }

    private void processConnection(Socket clientSocket) {
        System.out.printf("[%s:%s] 客户端上线\n", clientSocket.getInetAddress().toString(), clientSocket.getPort());
        //通过 clientSocket 来和客户端交互，先做好准备工作。获取 clientSocket 中的流对象
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
            // 进一步的就可以完成后面的逻辑 TODO
            while(true) {
                // 1. 读取请求并解析
                String request = bufferedReader.readLine();
                // 2. 根据请求计算响应
                String response = process(request);
                // 3. 把响应写回到客户端
                bufferedWriter.write(response + "\n");
                bufferedWriter.flush();
                System.out.printf("[%s:%d] req: %s; resp: %s\n", clientSocket.getInetAddress().toString(), clientSocket.getPort(), request, response);

            }


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.printf("[%s:%d] req: %s; resp: %s\n", clientSocket.getInetAddress().toString(), clientSocket.getPort() );
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        TcpEchoServer server = new TcpEchoServer(9000);
        server.start();
    }

}
