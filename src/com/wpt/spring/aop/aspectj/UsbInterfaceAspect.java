package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/14 0:05
 */

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: UsbInterfaceAspect
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/14 0:05
 * @version: 1.0
 */
@Aspect
@Component
public class UsbInterfaceAspect {
    @Before(value = "execution(public void com.wpt.spring.aop.aspectj.Phone.work())||execution(public void com.wpt.spring.aop.aspectj.Camera.work())")
    public void showBeginLog(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();

        System.out.println("showBeginLog执行：" + "--" + signature.getName());
    }
}
