package dao;

import entity.User;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description: 有关用户的数据库操作
 * * path: OnlineMusic-dao-UserDao
 * date: 2020/7/23 23:24
 */
public class UserDao {
    public  User login(User loginUser) {
        User user = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;


        try {
            String sql = "select  * from user where username=? and  password=?";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, loginUser.getUsername());
            statement.setString(2, loginUser.getPassword());
            //  执行sql
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setId(resultSet.getInt("id"));
                user.setPassword(resultSet.getString("password"));
                user.setAge(resultSet.getInt("age"));
                user.setGender(resultSet.getString("gender"));
                user.setEmail(resultSet.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.getClose(connection, statement, resultSet);
        }
        return user;
    }

    public void register(User user) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            String sql = "insert into user values (null,?, ?, ?, ?, ? )";
            connection = DBUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1,user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getGender());
            statement.setInt(4, user.getAge());
            statement.setString(5, user.getEmail());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.getClose(connection, statement, null);
        }
    }

    public static void main(String[] args) {
       /* User user = new User();
        user.setUsername("bit");
        user.setPassword("123");
        User loginUser = login(user);
        System.out.println(loginUser);*/
    }

}
