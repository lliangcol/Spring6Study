package pers.liuliang.spring6.aop.example;

import java.lang.reflect.Proxy;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 22:49
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("[动态代理][日志] " + method.getName() + " 方法开始了，参数是：" + args[0] + ", " + args[1]);
                    Object result = method.invoke(target, args);
                    System.out.println("[动态代理][日志] " + method.getName() + " 方法结束了，结果是：" + result);
                    return result;
                }
        );
    }
}
