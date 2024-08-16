package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/13 22:26
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: AopAspectjTest
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/13 22:26
 * @version: 1.0
 */
public class AopAspectjTest {
    @Test
    public void smartDogTestByProxy() {
        // Spring容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans08.xml");
        SmartAnimalable smartAnimalable = ioc.getBean(SmartAnimalable.class);
        smartAnimalable.getSum(10, 2);
        System.out.println("smartAnimalable的运行类型是：" + smartAnimalable.getClass());
    }

    @Test
    public void usbInterfaceAspect() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans08.xml");
        UsbInterface bean = ioc.getBean("phone", UsbInterface.class);
        UsbInterface bean2 = ioc.getBean("camera", UsbInterface.class);

        bean.work();
        bean2.work();
    }

    @Test
    public void carAspect() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans08.xml");
        Car car = ioc.getBean("car", Car.class);
        //class com.wpt.spring.aop.aspectj.Car$$EnhancerBySpringCGLIB$$afc5eae4
        System.out.println("car的运行类型："+car.getClass());
        car.run();
    }
}
