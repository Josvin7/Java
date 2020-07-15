package java_20200714;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/7/14 21:53
 */
public class Test1 {
    //private static Object GrayCode;

    public static void main(String[] args) {
        //GrayCode;
    }

    public class GrayCode {
        public String[] getGray(int n) {
            // write code here  给定一个整数n，请返回n位的格雷码，顺序为从0开始。
            String[] str = null;
            if(n == 1) {
                //使递归结束条件，1 位时对应2 个格雷码
                str = new String[2];
                str[0] = "0";
                str[1] = "1";
                return str;
            } else {
                // 先递归计算上一层结果，确定本层的数组大小，刚好是上次层 length 的二倍
                String[] tmp = getGray(n-1);
                int len = tmp.length *2;
                str = new String[len];
                //分别 给上一层结果首位 加0  和  加1  注意大小顺序
                for (int i = 0; i < len ; i++, len--) {
                    str[i] = "0" + tmp[i];
                    str[len-1] = "1" + tmp[i];
                }
            }
            return str;
        }
    }
}
