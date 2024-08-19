package com.wpt.spring.aop.xml;/**
 * @author wpt@onlying.cn
 * @date 2024/8/17 0:14
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.xml
 * @className: SmartAnimalAspest
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/17 0:14
 * @version: 1.0
 */
public class SmartAnimalAspest {
    public void showBeginLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
//得到方法名.
        String method_name = signature.getName();
//得到参数
        Object[] args = joinPoint.getArgs();
        System.out.println("XML 方式: 前置通知" + "--调用的方法是 " + method_name +
                "--参数是 --" + Arrays.asList(args));
    }

    public void showFinallyEndLog() {
        System.out.println("XML 方式: 最终通知 -- AOP-切入点表达式重用");
    }

    public void showSuccessEndLog(JoinPoint joinPoint, Object res) {
        System.out.println("XML 方式: 返回通知" + "--结果是--" + res);
    }

    public void showExceptionLog(JoinPoint joinPoint, Throwable throwable) {
        System.out.println("XML 方式: 异常通知 -- 异常信息--" + throwable);
    }

}
