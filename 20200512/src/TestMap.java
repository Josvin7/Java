import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestMap
 * @Description
 * @Author by房文辉
 * @Date 2020/5/12 16:55
 */
class Student {
    public String name;
    public int age;
    public String grade;
    public String school;


    public Student(String name, String grade, String school, int age) {
        this.name = name;
        this.grade = grade;
        this.school = school;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

public class TestMap {
    public static void main(String[] args) {
        Student s1 = new Student("小郭","大四","陕理工",22);
        Student s2 = new Student("拾柒","研一","邮电",23);
        Student s3 = new Student("十一","大一","陕理工",20);
        Student s4 = new Student("十三","研二","西安交大",24);

        Map<String,Student> studentMap = new TreeMap<>();
        //设置 key 对应的 value
        studentMap.put(s1.name,s1);
        studentMap.put(s2.name,s2);
        studentMap.put(s3.name,s3);
        studentMap.put(s4.name,s4);
        // 当前键值对 name -> student. 给定姓名就可以查找到对应的学生信息
        String name = "小郭";

        Student student = studentMap.get(name);

        System.out.println(student);

        Student s5 = new Student("小郭","研一","陕理工",122);
        studentMap.put(s5.name,s5);

        Student student1 = studentMap.get(name);
        System.out.println(student1);

        // 遍历一个 Map
        // Entry 条目. 也就是键值对.
        for (HashMap.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Iterator<Map.Entry<String, Student>> iterator = studentMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Student> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




    }
}
