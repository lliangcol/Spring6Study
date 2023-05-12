package com.liuliang.spring6.iocxml.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * <p>Description: FactoryBean 是 Spring 提供的一种整合第三方框架的常用机制</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 6:41
 */
public class UserFactoryBean implements FactoryBean<User> {
    /*
     * 配置一个 FactoryBean 类型的 bean，在获取 bean 的时候得到的并不是 class 属性中配置的这个类对象，
     * 而是 getObject 方法的返回值。
     *
     * 可以帮我们把复杂组件创建的详细过程和繁琐细节都屏蔽起来
     *
     */
    @Override
    public User getObject() throws Exception {
        return new User("张三", 30);
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
