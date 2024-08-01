package com.wpt.spring.homework;/**
 * @author wpt@onlying.cn
 * @date 2024/7/30 21:50
 */

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: com.wpt.spring.homework
 * @className: Homework01
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/30 21:50
 * @version: 1.0
 */
public class Homework01 {
    @Test
    public void getMonster(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("ok");

        Object bean = ioc.getBean("car");
        System.out.println(bean);
    }
}
