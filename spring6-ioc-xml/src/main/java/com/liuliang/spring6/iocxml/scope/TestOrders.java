package com.liuliang.spring6.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrders {
    @Test
    public void testSingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        // org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'orders'
        Orders orders1 = context.getBean("orders1", Orders.class);
        Orders orders2 = context.getBean("orders1", Orders.class);
        System.out.println(orders1 == orders2);
    }

    @Test
    public void testPrototype() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        // org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'orders2'
        Orders orders1 = context.getBean("orders2", Orders.class);
        Orders orders2 = context.getBean("orders2", Orders.class);
        System.out.println(orders1);
        System.out.println(orders2);
        System.out.println(orders1 == orders2);
    }
}
