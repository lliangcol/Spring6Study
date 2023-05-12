package com.liuliang.spring6.iocxml.lifecycle;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 0:09
 */
public class User {
    // 0. 创建 IoC 容器
    public User() {
        System.out.println("1. bean 对象创建，调用无参数构造函数");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2. bean 对象设置【name】属性值: " + name);
        this.name = name;
    }

    // 3. bean 对象后置处理器（初始化之前）
    public void init() {
        System.out.println("4. bean 对象初始化，调用指定的初始化方法");
    }

    // 5. bean 对象后置处理器（初始化之后）

    // 6. bean 对象创建完成，可以使用了


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public void destroy() {
        System.out.println("7. bean 对象销毁，调用指定的销毁方法");
    }

    // 8. 关闭 IoC 容器
}
