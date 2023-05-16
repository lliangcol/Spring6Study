package pers.liuliang.spring6.aop.example;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 22:55
 */
public class TestCalculator {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxyInstance = (Calculator) proxyFactory.getProxyInstance();
        int add = proxyInstance.add(1, 2);
        System.out.println("add = " + add);
    }
}
