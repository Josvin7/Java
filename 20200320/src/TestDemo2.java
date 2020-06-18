/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestDemo2
 * @Description getter sitter  构造方法  this
 * @Author by房文辉
 * @Date 2020/3/20 19:42
 */
class Student {
    private String name;
    private  int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //构造方法没有返回值
    public Student() {
        this("bit",18);
        System.out.println("Student()");
    }
    public Student(String name,int age) {
        this.age=age;
        this.name=name;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student = new Student();
        //student.setAge(99);
        System.out.println(student.getAge());//99
        System.out.println("=======================");
        //student.setName("caocao");
        System.out.println(student.getName());
    }
}
