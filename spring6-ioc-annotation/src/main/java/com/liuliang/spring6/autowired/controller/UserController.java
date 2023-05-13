package com.liuliang.spring6.autowired.controller;

import com.liuliang.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:14
 */
@Controller
public class UserController {
/*    // 1. 属性注入
    @Autowired
    private UserService userService;*/

    private UserService userService;

/*    // 2. set 方法注入
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    // 5. 只有一个有参数构造函数，无注解
    // 要求必须只有一个构造函数
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        System.out.println("[UserController]Execute add method...");
        userService.add();
    }
}
