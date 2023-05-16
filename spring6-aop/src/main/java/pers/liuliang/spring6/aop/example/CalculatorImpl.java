package pers.liuliang.spring6.aop.example;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 22:29
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int a, int b) {
        int result = a + b;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        int result = a - b;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        int result = a * b;
        System.out.println("方法内部 result = " + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a / b;
        System.out.println("方法内部 result = " + result);
        return result;
    }
}
