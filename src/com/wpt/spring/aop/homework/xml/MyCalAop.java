package com.wpt.spring.aop.homework.xml;/**
 * @author wpt@onlying.cn
 * @date 2024/8/19 21:50
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
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

public class MyCalAop {
    public void showBeginLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + "基于XML配置-开始执行，时间 = " + System.currentTimeMillis());
    }

    public void calEndLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName() + "基于XML配置-结束执行时间 = " + System.currentTimeMillis());
    }
}
