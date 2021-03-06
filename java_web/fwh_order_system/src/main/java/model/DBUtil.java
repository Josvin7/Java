package model;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DBUtil
 * @Description
 * @Author by小房
 * @Date 2020/8/9 19:34
 */
// DBUtil 本质上是一个管理了单例的 DataSource 的类
public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/fwh_order_system?characterEncoding=utf8&useSSL=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";


    private static volatile DataSource dataSource = null;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            synchronized (DBUtil.class) {
                if (dataSource == null) {
                    dataSource = new MysqlDataSource();
                    ((MysqlDataSource)dataSource).setURL(URL);
                    ((MysqlDataSource)dataSource).setUser(USERNAME);
                    ((MysqlDataSource)dataSource).setPassword(PASSWORD);
                }
            }
        }
        return dataSource;
    }


    public static Connection getConnection() {
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接失败，请检查数据库是否启动正常， url 是否正确");
        return null;
    }


    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {

            try {
                if (resultSet != null)  {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }


}

