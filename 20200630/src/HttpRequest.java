import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName HttpRequest
 * @Description
 * @Author by小房
 * @Date 2020/6/30 17:02
 */
// 表示一个 HTTP 请求，并负责解析。
public class HttpRequest {
    private String method;
    private String url;
    private String version;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> parameters = new HashMap<>();

    // 请求的构造逻辑，也使用工厂模式来构造
    // 此处的参数，就是从 socket 中获取的 InputStream 对象
    // 这个过程的本质就是在  " 反序列化 "
    public static HttpRequest build(InputStream inputStream ) throws IOException {
        HttpRequest request = new HttpRequest();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        // 1、解析首行
        String firstLine = bufferedReader.readLine();
        String[] firstLineTokens = firstLine.split(" ");
        request.method = firstLineTokens[0];
        request.url = firstLineTokens[1];
        request.version = firstLineTokens[2];

        // 2、解析url 中的参数
        int pos = request.url.indexOf("?");
        if(pos != -1) {
            // 看看 url 中是否有 ? . 如果没有, 就说明不带参数, 也就不必解析了
            // 此处的 parameters 是希望包含整个 参数 部分的内容
            // pos 表示 ? 的下标
            // /index.html?a=10&b=20
            // parameters 的结果就相当于是 a=10&b=20
            String  parameters = request.url.substring(pos + 1);
            parseKV(parameters, request.parameters);
        }
        // 3、解析 header
        String line = "";
        while ((line = bufferedReader.readLine()) != null && line.length() !=0) {
            String[] headerTokens = line.split(": ");
            request.headers.put(headerTokens[0], headerTokens[1]);
        }
        // 4、解析body
        return request;
    }

    private static void parseKV(String input, Map<String, String> output) {
        // 1、先按照 & 切分为若干键值对
        String[] kvTokens = input.split("&");
        // 2、针对区分结果在分别进行按照 = 切分，就得到了键和值
        for (String kv: kvTokens) {
            String[] result = kv.split("=");
            output.put(result[0], result[1]);

        }
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getVersion() {
        return version;
    }
    public String getHeader(String key) {
        return headers.get(key);
    }
    public String getParameter(String key) {
        return  parameters.get(key);

    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", version='" + version + '\'' +
                ", headers=" + headers +
                ", parameters=" + parameters +
                '}';
    }
}
