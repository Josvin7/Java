package view;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName HtmlGenerator
 * @Description
 * @Author by小房
 * @Date 2020/7/20 16:56
 */
public class HtmlGenerator {
    //通过字符串拼接的形式来获得一个 html 格式的内容来
    public static String getMessagePage(String message, String nextUrl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>");
        stringBuilder.append("<head>");
        stringBuilder.append("<meta charset=\"utf-8\">");
        stringBuilder.append("<title>提示页面</title>");
        stringBuilder.append("</head>");
        stringBuilder.append("<body>");

        stringBuilder.append("<h3>");
        stringBuilder.append(message);
        stringBuilder.append("</h3>");

        stringBuilder.append(String.format("<a href=\"%s\"> 点击这里进行跳转 </a>",
                nextUrl));

        stringBuilder.append("</body>");
        stringBuilder.append("</html>");

        return stringBuilder.toString();
    }


}
