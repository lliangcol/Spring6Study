package com.liuliang.spring6.autowired.service;

import com.liuliang.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:18
 */
@Service
public class UserServiceImpl implements UserService {
/*    @Autowired
    private UserDao userDao;*/

/*    // 3. 构造方法注入
    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }*/

/*    // 4. 形参上注入
    private UserDao userDao;

    public UserServiceImpl(@Autowired UserDao userDao) {
        this.userDao = userDao;
    }*/

    // 6. 两个注解，根据名称注入
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("[UserService]Execute add method...");
        userDao.add();
    }
}
