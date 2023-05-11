package com.liuliang.spring6.iocxml.diobj;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diobj.xml");
        Employee employee = context.getBean("employee", Employee.class);
        employee.work();

        Employee employee1 = context.getBean("employee1", Employee.class);
        employee1.work();

        Employee employee2 = context.getBean("employee2", Employee.class);
        employee2.work();
    }

    @Test
    public void TestDiArray() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Employee employee = context.getBean("employee", Employee.class);
        for (String s : employee.getHobby()) {
            System.out.println(s);
        }
    }
}
