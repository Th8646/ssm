package com.wpt.spring.test;/**
 * @author wpt@onlying.cn
 * @date 2024/7/18 1:07
 */

import com.wpt.spring.bean.Monster;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @projectName: spring
 * @package: com.wpt.spring.test
 * @className: SpringBeanTest
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/18 1:07
 * @version: 1.0
 */
public class SpringBeanTest {
    @Test
    public void getMonster() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.通过getBean获取对应的对象，默认返回的是Object，运行类型是Monster
        Monster monster01 = (Monster) ioc.getBean("monster01");
        System.out.println(monster01 + "运行类型是：" + monster01.getClass());


    }
}
