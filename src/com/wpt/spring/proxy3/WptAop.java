package com.wpt.spring.proxy3;/**
 * @author wpt@onlying.cn
 * @date 2024/8/12 23:57
 */

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @projectName: spring
 * @package: com.wpt.spring.proxy3
 * @className: WptAop
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/12 23:57
 * @version: 1.0
 */
public class WptAop {
    public static void before(Object proxy, Method method, Object[] args) {
        System.out.println("before方法执行前-日志-方法名  " + method.getName() + "-参数" +
                Arrays.asList(args));//从AOP看，就是一个横切关注点--前置通知
    }

    public static void after(Object result, Method method) {
        System.out.println("after方法执行前-日志-方法名  " + method.getName() +
                "-结果result=" + result);//从AOP看，就是一个横切关注点--返回通知
    }
}
