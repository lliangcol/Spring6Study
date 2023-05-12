package com.liuliang.spring6.iocxml.auto.dao;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 7:10
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("[UserDao]Execute add method...");
    }
}
