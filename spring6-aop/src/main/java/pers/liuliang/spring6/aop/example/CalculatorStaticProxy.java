package pers.liuliang.spring6.aop.example;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 22:42
 */
public class CalculatorStaticProxy implements Calculator {
    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("[日志] add 方法开始了，参数是：" + a + ", " + b);
        int result = calculator.add(a, b);
        System.out.println("[日志] add 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int sub(int a, int b) {
        System.out.println("[日志] sub 方法开始了，参数是：" + a + ", " + b);
        int result = calculator.sub(a, b);
        System.out.println("[日志] sub 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int mul(int a, int b) {
        System.out.println("[日志] mul 方法开始了，参数是：" + a + ", " + b);
        int result = calculator.mul(a, b);
        System.out.println("[日志] mul 方法结束了，结果是：" + result);
        return result;
    }

    @Override
    public int div(int a, int b) {
        System.out.println("[日志] div 方法开始了，参数是：" + a + ", " + b);
        int result = calculator.div(a, b);
        System.out.println("[日志] div 方法结束了，结果是：" + result);
        return result;
    }
}
