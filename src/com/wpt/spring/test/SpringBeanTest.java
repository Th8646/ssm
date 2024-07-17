package com.wpt.spring.test;/**
 * @author wpt@onlying.cn
 * @date 2024/7/18 1:07
 */

import com.wpt.spring.bean.Monster;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

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
        System.out.println(monster01 + "运行类型是：" + monster01.getClass() + "编译类型是：" + monster01.getClass());
        System.out.println(monster01 + "运行类型是：" + monster01.getClass() + "名字是：" + monster01.getName());


        System.out.println("--------------------------------");
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("--------------------------------");
        Monster monster011 = ioc.getBean("monster01", Monster.class);
        System.out.println(monster011 + "运行类型是：" + monster011.getClass() + "编译类型是：" + monster011.getClass());


    }

    // 验证类加载路径
    @Test
    public void classPath() {
        File file = new File(this.getClass().getResource("/").getPath());
        // 类加载路径
        System.out.println("file=" + file);
    }
}
