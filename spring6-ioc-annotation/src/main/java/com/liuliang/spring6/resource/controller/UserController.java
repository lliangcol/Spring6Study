package com.liuliang.spring6.resource.controller;

import com.liuliang.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 14:14
 */
@Controller("myUserController")
public class UserController {
/*    // 根据名称进行注入
    @Resource(name = "myUserService")
    private UserService userService;*/

    // 不指定名称，根据属性名查找，属性名不存在时，根据类型
    // 默认 byName 注入，未指定 name 时把属性名当作 name
    // 根据 name 找不到时，以 byType 注入
    // byType 注入时，某种类型的 Bean 只能有一个
    @Resource
    private UserService userService;

    public void add() {
        System.out.println("[UserController]Execute add method...");
        userService.add();
    }
}
