package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/13 21:59
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: SmartAnimalableAspect
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/13 21:59
 * @version: 1.0
 */
@Aspect
@Component // 注入切面类到容器
public class SmartAnimalAspect {
    /**
     * 1.@Before注解 表示是一个前置通知
     * 2.value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))"
     * 指定将f1方法切入哪个类的哪个方法  方法修饰符  返回类型  全类名.方法名(形参列表)
     * 3.f1方法可以理解成一个切入方法 比如，showBeginLog等
     * 4.JoinPoint joinPoint 在底层执行时，会给该切入方法一个 joinPoint对象，
     * 通过该方法可以获取到相关信息
     */
    @Before(value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))")
    public void f1(JoinPoint joinPoint) {
        //通过连接点对象，拿方法签名
        Signature signature = joinPoint.getSignature();
        System.out.println("f1切面类方法执行前-日志-方法名  " + signature.getName() + "-参数" +
                Arrays.asList(joinPoint.getArgs()));//从AOP看，就是一个横切关注点--前置通知
    }


    // 返回通知
    @AfterReturning(value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))")
    public void f2(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("f2切面类方法方法执行正常结束-日志-方法名  " + signature.getName() +
                "-结果result=" );//从AOP看，就是一个横切关注点--返回通知
    }
    @AfterThrowing(value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))")
    public void f3(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("f3切面类方法-执行异常-日志-方法名  " + signature.getName());//从AOP看，就是一个横切关注点--返回通知
    }
    @After(value = "execution(public float com.wpt.spring.aop.aspectj.SmartDog.getSum(float, float))")
    public void f4(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("f4切面类方法-最终执行完毕-日志-方法名  " + signature.getName());//从AOP看，就是一个横切关注点--返回通知
    }

}
