import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName TestJDBC
 * @Description
 * @Author by房文辉
 * @Date 2020/6/5 21:55
 */
public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        //
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setURL("jdbc:mysql://127.0.0.1:3306/20200531?characterEncoding=utf-8&useSSL=true");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("fwh147258");

        Connection connection = dataSource.getConnection();

        int id = 1;
        String name = "caocao";
        int classId = 10;

        String sql = "insert into student values(?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setInt(3, classId);
        System.out.println("statement: " + statement);

        int ret = statement.executeUpdate();
        System.out.println("ret: " + ret);

        statement.close();
        connection.close();
    }
}
