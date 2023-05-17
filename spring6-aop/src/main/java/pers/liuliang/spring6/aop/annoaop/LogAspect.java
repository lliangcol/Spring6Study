package pers.liuliang.spring6.aop.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>Description: 切面类</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/17 - 6:56
 */
@Aspect // 切面类
@Component // IoC 容器中进行管理
public class LogAspect {
    // 设置切入点和通知类型
    // 切面的优先级：目标方法 - 切面 A（内层） - 切面 B（外层），优先级高的切面：外层
    // 使用 @Order 注解控制：@Order(较小的数)-优先级高

    // 切入点表达式
    // execution(权限修饰符 方法返回值 方法所在类型的全类名.方法名(参数列表))
    // 通知类型：
    // 前置 @Before()
    @Before(value = "execution(public int pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args));
    }

    // 返回 @AfterReturning
    @AfterReturning(value = "execution(* pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->返回通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args) + "，返回值：" + result);
    }

    // 异常 @AfterThrowing
    @AfterThrowing(value = "execution(* pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))", throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->异常通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args) + "，异常信息：" + ex);
    }

    // 后置 @After()
    //@After(value = "pointcut()")
    //@After(value = "pers.liuliang.spring6.aop.annoaop.LogAspect.pointcut()")
    @After(value = "execution(* pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->后置通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args));
    }

    // 环绕 @Around()
    @Around(value = "execution(public int pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String string = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("Logger-->环绕通知，目标方法之前执行，方法名称：" + methodName + "，参数：" + string);
            result = joinPoint.proceed();
            System.out.println(result);
            System.out.println("Logger-->环绕通知，目标方法返回值之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Logger-->环绕通知，目标方法出现异常");
        } finally {
            System.out.println("Logger-->环绕通知，目标方法执行完毕");
        }
        return result;
    }

    // 重用切入点表达式
    @Pointcut(value = "execution(public int pers.liuliang.spring6.aop.annoaop.CalculatorImpl.*(..))")
    public void pointcut() {
    }
}
