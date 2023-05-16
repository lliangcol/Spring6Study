package pers.liuliang.service.impl;

import pers.liuliang.anno.Bean;
import pers.liuliang.anno.Di;
import pers.liuliang.dao.UserDao;
import pers.liuliang.service.UserService;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 19:56
 */
@Bean
public class UserServiceImpl implements UserService {
    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("[service]add user");
        userDao.add();
    }
}
