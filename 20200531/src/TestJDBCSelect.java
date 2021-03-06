
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestJDBCSelect
 * @Description
 * @Author by房文辉
 * @Date 2020/6/5 22:59
 */
public class TestJDBCSelect {
    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/java16_0531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("1234");

        Connection connection = dataSource.getConnection();

        String sql = "select * from student";
        PreparedStatement statement = connection.prepareStatement(sql);


        ResultSet resultSet = statement.executeQuery();

        while(resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int classId = resultSet.getInt("classId");

            System.out.println("id: " + id + "name: " + name + "classId" + classId);

        }
        resultSet.close();
        statement.close();
        connection.close();


    }
}
