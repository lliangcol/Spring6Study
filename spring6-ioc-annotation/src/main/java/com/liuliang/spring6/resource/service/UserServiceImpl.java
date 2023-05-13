package com.liuliang.spring6.resource.service;

import com.liuliang.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:18
 */
@Service(value = "myUserService")
public class UserServiceImpl implements UserService {
    // 不指定名称时，使用属性名称进行注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("[UserService]Execute add method...");
        myUserDao.add();
    }
}
