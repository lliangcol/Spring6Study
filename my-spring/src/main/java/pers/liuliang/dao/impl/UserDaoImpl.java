package pers.liuliang.dao.impl;

import pers.liuliang.anno.Bean;
import pers.liuliang.dao.UserDao;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 19:58
 */
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("[dao]add user");
    }
}
