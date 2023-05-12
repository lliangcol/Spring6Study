package com.liuliang.spring6.iocxml.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 0:26
 */
public class TestUser {
    public static void main(String[] args) {
        System.out.println(" 0. 创建 IoC 容器");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6. bean 对象可用，" + user);
        context.close();
    }
}
