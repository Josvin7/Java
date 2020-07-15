package modle;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName User
 * @Description
 * @Author by小房
 * @Date 2020/7/15 17:50
 */
public class User {
    private int userId;
    private String name;
    private String password;

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
