package com.wpt.spring.proxy2;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 21:18
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @projectName: spring
 * @package: com.wpt.spring.proxy2
 * @className: VehicleProxyProvider
 * @author: wpt
 * @description: 该类可以提供一个方法，返回一个代理对象
 * @date: 2024/8/5 21:18
 * @version: 1.0
 */
public class VehicleProxyProvider {

    // 定义属性，使用target_vehicle表示真正执行的对象，实现了Vehicle接口
    private Vehicle target_vehicle;

    //构造器
    public VehicleProxyProvider(Vehicle target_vehicle) {
        this.target_vehicle = target_vehicle;
    }
    // 编写一个方法可以返回一个代理对象

    /*
     *
     *    public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)
     *         throws IllegalArgumentException
     * 1.ClassLoader loader:类加载器
     * 2.Class<?>[] interfaces:将来要代理的对象的接口信息
     * 3.InvocationHandler h  调用处理器、对象，内部有invoke方法
     */
    public Vehicle getProxy() {
        // 得到类加载器
        ClassLoader classLoader = target_vehicle.getClass().getClassLoader();
        // 得到接口信息
        Class<?>[] interfaces = target_vehicle.getClass().getInterfaces();
        // 创建  InvocationHandler h
        InvocationHandler invocationHandler = new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             *
             * @param method 通过dialing对象调用方法时，的哪个方法
             *
             * @param args 表示，通过代理对象调用方法时传入的参数

             * @return 返回值是代理对象调用方法的返回值
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("交通工具开始运行了....");
                // method 是  public abstract void com.wpt.spring.proxy2.Vehicle.run()
                // target_vehicle 是 Ship对象
                Object result = method.invoke(target_vehicle, args);
                System.out.println("交通工具停止运行了....");

                return result;
            }
        };
        Vehicle proxy = (Vehicle) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
        return proxy;
    }
}
