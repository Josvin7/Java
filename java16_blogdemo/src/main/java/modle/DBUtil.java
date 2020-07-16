package modle;

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
 * @Date 2020/7/15 17:51
 */
// 管理数据库连接   建立连接    断开连接
public class DBUtil {
    private static volatile DataSource dataSource = null;
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/java16_blogdemo?characterEncoding=utf-8&useSSL=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "fwh147258";

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
    // 通过这个方法来建立连接

     public static Connection getConnection() {
         try {
             return getDataSource().getConnection();
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return null;
     }
    // 通过这个方法来断开连接
    public static void close(Connection connection, PreparedStatement statement, ResultSet resultSet) {

            try {
                if (resultSet != null) {
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
