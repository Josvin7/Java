package model;

import util.OrderSystemException;

import java.io.ObjectStreamException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName UserDao
 * @Description
 * @Author by小房
 * @Date 2020/8/9 21:07
 */
// 主要实现三个功能
// 1、插入用户  （注册时候要用到）
// 2、按照名字查找用户 （登录的时候使用）
// 3、按照用户 id 查找  （展示信息的时候使用）
public class UserDao {
    public  void add(User user) throws OrderSystemException {
        // 【注意】 JDBC 编程
        // 1、先获取数据库的连接（DataSource）
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql 语句 （PrepareStatement）
        String sql = "insert into user values(null, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getName());
            statement.setString(2, user.getPassword());
            statement.setInt(3, user.getIsAdmin());
            // 3、执行sql 语句 （executeQuery， executeUpdate）
            int ret = statement.executeUpdate();
            if (ret != 1) {
                throw new OrderSystemException("插入用户失败");
            }
            System.out.println("插入用户成功");
        } catch (SQLException  e) {
            e.printStackTrace();
            throw new OrderSystemException("插入用户失败");
        } finally {
            // 4、关闭连接(close)
            DBUtil.close(connection,statement, null);
        }
    }

    public User selectByName(String name) throws OrderSystemException {
        // 1、获取数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql = "select * from user where name = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            // 3、执行sql
            resultSet = statement.executeQuery();
            // 4、遍历结果集
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setIsAdmin(resultSet.getInt("isAdmin"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("按照名字查找用户失败！");
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    public User selectById(int userId) throws OrderSystemException {
        // 1、获取数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql = "select * from user where userId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            // 3、执行 sql
            resultSet = statement.executeQuery();
            // 4、遍历结果集， userId 是主键，只能查到一个结果
            if (resultSet.next()) {
                User user = new User();
                user.setName(resultSet.getString("name"));
                user.setPassword(resultSet.getString("password"));
                user.setIsAdmin(resultSet.getInt("isAdmin"));
                user.setUserId(resultSet.getInt("userId"));
                return  user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("按照 id 查找用户失败");
        } finally {
            // 5、断开连接
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    public static void main(String[] args) throws OrderSystemException {
        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("fwh");
        user.setPassword("123456");
        user.setIsAdmin(0);
        userDao.add(user);
    }
}
