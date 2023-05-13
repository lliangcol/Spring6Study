package com.liuliang.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:43
 */
@Repository
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("[UserDao-Redis]Execute add method...");
    }
}
