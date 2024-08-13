package com.wpt.spring.proxy3;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 22:34
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.proxy
 * @className: MyProxyProvider
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 22:34
 * @version: 1.0
 */
public class MyProxyProvider {
    // 定义执行的目标对象
    private SmartAnimalable target_obj;

    public MyProxyProvider(SmartAnimalable target_obj) {
        this.target_obj = target_obj;
    }


    //
    public SmartAnimalable getProxy() {
        ClassLoader classLoader = target_obj.getClass().getClassLoader();
        Class<?>[] interfaces = target_obj.getClass().getInterfaces();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    WptAop.before(proxy, method, args);
                    // 使用反射调用方法
                    result = method.invoke(target_obj, args);

                    WptAop.after(result, method);

                } catch (Exception e) {
                    // 如果反射执行方法是出现了异常，进入catch块
                    e.printStackTrace();
                    System.out.println("方法执行异常-日志-方法名-" + method.getName()
                            + "异常类型_" + e.getClass().getName());//从AOP看，就是一个横切关注点--异常通知
                } finally {//不管是否出现异常，最终都会执行到finally代码块
                    System.out.println("方法最终结束-日志-方法名" + method.getName());//从AOP看，就是一个横切关注点--最终通知
                }
                return result;
            }
        };
        SmartAnimalable smartAnimalable = (SmartAnimalable) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return smartAnimalable;
    }
}
