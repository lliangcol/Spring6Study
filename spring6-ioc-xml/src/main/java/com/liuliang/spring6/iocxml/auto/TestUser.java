package com.liuliang.spring6.iocxml.auto;

import com.liuliang.spring6.iocxml.auto.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 7:27
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        UserController userController = context.getBean("userController", UserController.class);
        userController.addUser();
    }
}
