package com.liuliang.spring6.iocxml.diobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDepartment {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Department department = context.getBean("department01", Department.class);

        for (Employee employee : department.getEmployeeList()) {
            System.out.println(employee);
        }
    }
}
