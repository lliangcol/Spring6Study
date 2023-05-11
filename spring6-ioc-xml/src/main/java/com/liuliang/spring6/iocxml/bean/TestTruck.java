package com.liuliang.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTruck {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 如果组件类实现了接口，那么在获取 bean 对象时，使用接口类型接收
        // 前提：根据类型来获取 bean 对象，在满足类型唯一的情况下，可以使用类型来获取 bean 对象
        // 内部：【对象 instanceof 指定的类型】 返回 true，表示对象是指定类型的实例
        // 有多个实现类的情况下，使用类型来获取 bean 对象，会报错
        // Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'com.liuliang.spring6.iocxml.bean.Run' available: expected single matching bean but found 2: truck,tank
        Run run = context.getBean(Run.class);
        System.out.println(run);
        run.run();
    }
}
