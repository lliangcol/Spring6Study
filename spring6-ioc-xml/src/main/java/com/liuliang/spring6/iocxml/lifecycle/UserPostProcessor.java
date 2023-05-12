package com.liuliang.spring6.iocxml.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * <p>Description: User 对象后置处理器</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 0:37
 */
public class UserPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3. bean 对象后置处理器（初始化之前）");
        System.out.println(beanName + "::" + bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5. bean 对象后置处理器（初始化之后）");
        System.out.println(beanName + "::" + bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
