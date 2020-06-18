/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo1
 * @Description
 * @Author by房文辉
 * @Date 2020/3/22 21:47
 */
class fun {
    public int var;
}
public class TestDemo1 {
    public static void swap(fun f,fun f1) {
        int tmp=f.var;
        f.var=f1.var;
        f1.var=tmp;
    }
    public static void main(String[] args) {
        fun f = new fun();
        f.var =10;
        fun f1 = new fun();
        f1.var =20;
        swap(f,f1);
        System.out.println(f.var+" "+f1.var);
    }
}
