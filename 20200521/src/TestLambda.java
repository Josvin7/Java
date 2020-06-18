import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestLambda
 * @Description
 * @Author by房文辉
 * @Date 2020/5/22 23:34
 */
public class TestLambda {
    static class Student {
        public String name;
        public int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("张三", 78),
                new Student("李四", 90),
                new Student("王五", 95),
                new Student("赵六", 92),
                new Student("蔡徐坤", 99),
        };

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.score - o1.score;
            }
        });
        System.out.println(Arrays.toString(students));
    }

}
