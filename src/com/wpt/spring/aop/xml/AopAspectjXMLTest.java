package com.wpt.spring.aop.xml;/**
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
public class AopAspectjXMLTest {
    @Test
    public void smartDogTestByProxy() {
        // Spring容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans09.xml");
        SmartAnimalable smartAnimalable = ioc.getBean(SmartAnimalable.class);
        smartAnimalable.getSum(10, 2);
        System.out.println("smartAnimalable的运行类型是：" + smartAnimalable.getClass());
    }

}
