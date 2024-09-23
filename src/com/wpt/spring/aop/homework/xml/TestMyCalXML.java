package com.wpt.spring.aop.homework.xml;/**
 * @author wpt@onlying.cn
 * @date 2024/8/19 21:56
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.homework
 * @className: TestMyCal
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/19 21:56
 * @version: 1.0
 */
public class TestMyCalXML {
    @Test
    public  void testMyCalByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans11.xml");
        Cal cal = ioc.getBean(Cal.class);
        cal.cal1(10);
        cal.cal2(10);
    }
}
