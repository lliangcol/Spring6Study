package pers.liuliang.spring6.aop.xmlaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * <p>Description: 切面类</p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/17 - 6:56
 */
@Component // IoC 容器中进行管理
public class LogAspect {
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->前置通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args));
    }

    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->返回通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args) + "，返回值：" + result);
    }

    public void afterThrowingMethod(JoinPoint joinPoint, Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->异常通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args) + "，异常信息：" + ex);
    }

    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger-->后置通知，方法名称：" + methodName + "，参数：" + Arrays.toString(args));
    }

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
}
