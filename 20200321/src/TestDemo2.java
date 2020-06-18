/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description
 * @Author by房文辉
 * @Date 2020/3/21 19:55
 */
class Book {
    private String name;
    private String auther;
    private int price;

    private static int count =0;

    static {
        count =199;
        System.out.println("静态代码块！");
    }
    {
        System.out.println("实例代码块！");


    }
    public Book() {
        System.out.println("Book()");
    }

    public Book(String name, String auther, int price) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        System.out.println("Book(String,String,int)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", price=" + price +
                '}';
    }
}
public class TestDemo2 {

    public static void main(String[] args) {
        Book book = new Book("数据结构","xxx",90);
        System.out.println(new Book().toString());
        System.out.println(book.getName());

    }
}
