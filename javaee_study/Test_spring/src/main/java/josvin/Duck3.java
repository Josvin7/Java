package josvin;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin-Duck
 * date: 2020/8/11 11:58
 */
//@Setter
public class Duck3 {
    private String name;
    private Integer age;
    private Duck3 next;

    @Override
    public String toString() {
        return "Duck3{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", next=" + next +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Duck3 getNext() {
        return next;
    }

    public void setNext(Duck3 next) {
        this.next = next;
    }
}
