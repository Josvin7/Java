package josvin;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: javaee_study-josvin-Duck
 * date: 2020/8/11 11:58
 */
public class Duck {
    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
