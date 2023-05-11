package com.liuliang.spring6.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.info();
    }

    @Test
    public void testRef() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student1 = context.getBean("student01", Student.class);
        student1.info();
    }
}
