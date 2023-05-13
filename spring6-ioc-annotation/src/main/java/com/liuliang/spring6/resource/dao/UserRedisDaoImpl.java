package com.liuliang.spring6.resource.dao;

import org.springframework.stereotype.Repository;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:43
 */
@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("[UserDao-Redis]Execute add method...");
    }
}
