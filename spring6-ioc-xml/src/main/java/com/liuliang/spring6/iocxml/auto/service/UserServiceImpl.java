package com.liuliang.spring6.iocxml.auto.service;

import com.liuliang.spring6.iocxml.auto.dao.UserDao;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 7:01
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("[UserService]Execute add method...");
        userDao.add();
    }
}
