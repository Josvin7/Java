import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName UdpEchoServer
 * @Description
 * @Author by房文辉
 * @Date 2020/6/22 19:32
 */
public class UdpEchoServer {
    //两步：
    //1、进行初始化操作（实例化 Socket对象）
    //2、进入主循环，接受并处理请求
    //   a）读取数据并解析
    //   b）根据请求并计算响应
    //   c）把响应结果写回到客户端
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while(true) {
            //   a）读取数据并解析
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(requestPacket);
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength()).trim();
            //   b）根据请求并计算响应
            String response = process(request);
            //   c）把响应结果写回到客户端,相应数据数据就是response ，需要包装成一个 Packet 对象
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.getBytes().length, requestPacket.getSocketAddress());
            socket.send(responsePacket);

            //[在这里可以打印一条日志]
            System.out.printf("[%s:%d] req: %s; resq: %s\n", requestPacket.getAddress().toString(), requestPacket.getPort(), request, response);

        }
    }

    public String process(String request) {
        //由于这里是一个echo server, 请求内容是啥，响应内容就是啥。
        //如果是一个更复杂的请求器，此处就需要包含更多的业务逻辑来进行计算。
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(9090);
        server.start();
    }
}
