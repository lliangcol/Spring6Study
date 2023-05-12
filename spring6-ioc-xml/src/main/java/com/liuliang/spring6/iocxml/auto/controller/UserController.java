package com.liuliang.spring6.iocxml.auto.controller;

import com.liuliang.spring6.iocxml.auto.service.UserService;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 6:59
 */
public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        System.out.println("[UserController]Execute addUser method...");
        userService.add();
    }
}
