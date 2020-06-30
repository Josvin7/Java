import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName HttpResponse
 * @Description
 * @Author by小房
 * @Date 2020/6/30 17:02
 */
// 表示一个 HTTP 响应，负责构造
    // 进行序列化操作
public class HttpResponse {
    private String version = "HTTP/1.1";
    private int status;
    private String message;
    private Map<String, String> headers = new HashMap<>();
    private StringBuilder body = new StringBuilder();//方便拼接
    //当代码需要把响应1写会给客户端的时候，就往OutputStream 中写就好了
    private OutputStream outputStream = null;

    public static HttpResponse build(OutputStream outputStream) {
        HttpResponse response = new HttpResponse();
        response.outputStream = outputStream;
        return response;

    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public void setHeader(String key, String value) {
        headers.put(key, value);
    }

    public void writeBody(String content) {
        body.append(content);
    }

    //还需要一个专门的方法，把这些属性 按照 HTTP 协议 写到 socket
    public void flush() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(version + " " + status + " " + message + "\n");
        headers.put("Content-Length", body.toString().getBytes().length +"");
        for(Map.Entry<String, String> entry : headers.entrySet()) {
            bufferedWriter.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        bufferedWriter.write("\n");
        bufferedWriter.write(body.toString());
        bufferedWriter.flush();
    }
}
