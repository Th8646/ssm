package com.wpt.spring.aop.homework;/**
 * @author wpt@onlying.cn
 * @date 2024/8/19 21:50
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.homework
 * @className: MyCalAop
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/19 21:50
 * @version: 1.0
 */
@Aspect
@Component
public class MyCalAop {
    @Before(value = "execution(public int com.wpt.spring.aop.homework.MyCal.*(int))")
    public void showBeginLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + "开始执行，时间 = " + System.currentTimeMillis());
    }

    @AfterReturning(value = "execution(public int com.wpt.spring.aop.homework.MyCal.*(int))")
    public void calEndLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + "结束执行时间 = " + System.currentTimeMillis());
    }
}
