package com.liuliang.spring6;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Description: User 测试</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/10 - 21:55
 */
public class TestUser {
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

    @Test
    public void testUserObject() {
        // 加载 Spring 配置文件，对象创建
        // ApplicationContext：代表 IOC 容器
        // ClassPathXmlApplicationContext：当前应用的 XML 配置文件在 ClassPath 下
        // 根据 Spring 配置文件得到 IOC 容器对象
        // 该对象中包含了所有创建对象的信息
        // 通过 id 获取对象
        // 该方法执行之后，对象已经创建好了，但是还没有向属性中设置值
        // 该方法的执行过程中，会创建配置文件中的所有对象
        // 如果配置文件中有错误，该方法执行的时候，会报错
        // 过程：
        // 1. 创建 IOC 容器对象
        // 2. 创建对象
        // 3. 为对象的属性赋值
        // 4. 执行对象的初始化方法
        // 5. 对象创建完成，可以使用了
        // 6. 销毁对象
        // 7. 关闭容器
        // 加载 bean.xml 配置文件
        // 对 xml 配置文件进行解析操作
        // 获取 xml 文件 bean 标签属性值：id class
        // 使用反射根据 class 类全路径进行创建对象
        // 将创建的对象存入 map 集合中，key 为 id 值，value 为创建的对象
        // 使用 bean 标签中的 property 属性为对象中的属性赋值
        // 使用反射调用 set 方法为属性赋值
        // 执行对象的初始化方法
        // 从 map 集合中获取所有对象，根据 id 获取
        // private final Map<String, BeanDefinition> beanDefinitionMap;
        // BeanDefinition beanDefinition = beanDefinitionMap.get(id);
        // BeanDefinition 中包含了创建对象的信息
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        // 使用对象调用方法进行测试
        user.greet();

        // 手动写日志
        logger.info("info: {}", user);
    }

    @Test
    public void testCreateUserObject() throws Exception {
        Class<?> clazz = Class.forName("com.liuliang.spring6.User");
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
