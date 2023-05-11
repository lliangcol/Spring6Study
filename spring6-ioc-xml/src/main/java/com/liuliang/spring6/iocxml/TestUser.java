package com.liuliang.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 1. 根据 id 获取 bean 对象
        User user1 = (User) context.getBean("user");
        System.out.println("1. 根据 id 获取的 bean 对象：" + user1);

        // 2. 根据 class 获取 bean 对象，要求 class 类型唯一
        User user2 = context.getBean(User.class);
        System.out.println("2. 根据 class 获取的 bean 对象：" + user2);

        // 3. 根据 id 和 class 获取 bean 对象
        User user3 = context.getBean("user", User.class);
        System.out.println("3. 根据 id 和 class 获取的 bean 对象：" + user3);

    }
}
