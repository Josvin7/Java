import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestMySQL
 * @Description
 * @Author by小房
 * @Date 2020/7/12 18:52
 */
public class TestMySQL {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/java16_0528?characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "fwh147258";
        DataSource dataSource = new MysqlDataSource();//管理链接
        ((MysqlDataSource)dataSource).setURL(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);
        // 与数据库建立连接
        Connection connection = dataSource.getConnection();
        // 访问数据库
        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);
        //执行sql
        ResultSet resultSet = statement.executeQuery();
        //遍历结果ji
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getInt("classes_id"));
        }
        resultSet.close();
        statement.close();
        connection.close();


    }
}
