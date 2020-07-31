package service;

import dao.UserDao;
import entity.User;

/**
 * Created With IntelliJ IDEA .
 *
 * @author Josvin
 * description:
 * path: OnlineMusic-service-UserService
 * date: 2020/7/31 10:09
 */
public class UserService {

    public User login(User loginUser) {
        UserDao userDao = new UserDao();
        User user = userDao.login(loginUser);
        return user;
    }
}
