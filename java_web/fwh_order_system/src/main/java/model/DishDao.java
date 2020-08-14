package model;

import util.OrderSystemException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DishDao
 * @Description
 * @Author by小房
 * @Date 2020/8/9 21:07
 */
//
    /*
    * 操作 菜品表
    * 1、新增菜品
    * 2、删除菜品
    * 3、查询所有菜品
    * 4、查询指定菜品
    * */
public class DishDao {
    public void add(Dish dish) throws OrderSystemException {
        // 1、获取数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql = "insert into dishes values(null, ? , ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, dish.getName());
            statement.setInt(2, dish.getPrice());
            // 3、执行 sql
             int ret = statement.executeUpdate();
            if (ret != 1) {
                throw new OrderSystemException("插入菜品失败！");
            }
            System.out.println("插入菜品成功！");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("插入菜品失败！");
        } finally {
            DBUtil.close(connection, statement, null);
        }
    }

    public void delete(int dishId) throws OrderSystemException {
        // 1、获取数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql  = "delete from dishes where dishId = ? ";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, dishId);
            // 3、执行 sql
            int ret = statement.executeUpdate();
            if (ret != 1) {
                throw new OrderSystemException("删除菜品失败！");
            }
            System.out.println("删除菜品成功");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("删除菜品失败！");
        } finally {
            DBUtil.close(connection, statement, null);
        }
    }

    public List<Dish> selectAll() throws OrderSystemException {
        List<Dish> dishes = new ArrayList<>();
        // 1、建立数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql = "select * from dishes";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            // 3、执行 sql
            resultSet = statement.executeQuery();
            // 4、遍历结果集， 这里会有多个结果，所以要用到 while
            while (resultSet.next()) {
                Dish dish = new Dish();
                dish.setDishId(resultSet.getInt("dishId"));
                dish.setName(resultSet.getString("name"));
                dish.setPrice(resultSet.getInt("price"));
                dishes.add(dish);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("查找所有菜品出错");
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return dishes;
    }

    public Dish selectById(int dishId) throws OrderSystemException {
        // 1、获取数据库连接
        Connection connection = DBUtil.getConnection();
        // 2、拼装 sql
        String sql = "select * from dishes where dishId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, dishId);
            // 3、执行 sql
            resultSet = statement.executeQuery();
            // 4、遍历结果集
            if (resultSet.next()) {
                Dish dish = new Dish();
                dish.setName(resultSet.getString("name"));
                dish.setPrice(resultSet.getInt("price"));
                dish.setDishId(resultSet.getInt("dishId"));
                return dish;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new OrderSystemException("按照 id 查找菜品出错");
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }
}
