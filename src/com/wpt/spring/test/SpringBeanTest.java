package com.wpt.spring.test;/**
 * @author wpt@onlying.cn
 * @date 2024/7/18 1:07
 */

import com.wpt.spring.bean.*;
import com.wpt.spring.component.MyComponent;
import com.wpt.spring.component.UserAction;
import com.wpt.spring.component.UserDao;
import com.wpt.spring.depinjection.PhoneService;
import com.wpt.spring.service.MemberServiceImpl;
import com.wpt.spring.web.OrderAction;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

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
    public void setProByDependency(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans07.xml");
        PhoneService phoneService = ioc.getBean("phoneService", PhoneService.class);
        System.out.println(phoneService);
        phoneService.save();

    }
    @Test
    public void setBeanByAutowired(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans05.xml");
        UserAction userAction = ioc.getBean("userAction", UserAction.class);
        System.out.println("userAction = " + userAction);
        userAction.sayOk();
    }

    @Test
    public void setBeanByAnnotation(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans05.xml");
        System.out.println("ok");
        MyComponent myComponent = ioc.getBean("myComponent", MyComponent.class);
        UserDao userDao = ioc.getBean(UserDao.class);
        System.out.println(myComponent);
        System.out.println(userDao);
    }

    @Test
    public void setBeanByAutowire(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans03.xml");
        OrderAction orderAction = ioc.getBean("orderAction", OrderAction.class);
        System.out.println(orderAction);
        System.out.println(orderAction.getOrderService());
    }
    @Test
    public void setBeanByFile() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster monster1000 = ioc.getBean("monster1000", Monster.class);
        System.out.println("monster1000 = " + monster1000);
    }

    @Test
    public void testBeanPostProcessor() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans02.xml");
        House house = ioc.getBean("house", House.class);
        System.out.println("use  House = " + house);
    }

    @Test
    public void testBeanLife() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        House house = ioc.getBean("house", House.class);
        System.out.println("house = " + house);

        // 关闭容器
        ioc.close();
    }

    @Test
    public void testBeanScope() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Cat cat = ioc.getBean("cat", Cat.class);
        Cat cat2 = ioc.getBean("cat", Cat.class);
        Cat cat3 = ioc.getBean("cat", Cat.class);
        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3);
    }

    @Test
    public void beanCreatedOrder() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Student student = ioc.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void setBeanByFactoryBean() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster myStaticBean = ioc.getBean("my_monster05", Monster.class);
        System.out.println(myStaticBean);
    }

    @Test
    public void setBeanByInstanceFactory() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster myStaticBean = ioc.getBean("my_monster02", Monster.class);
        System.out.println(myStaticBean);
    }

    @Test
    public void setBeanByStaticFactory() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Monster myStaticBean = ioc.getBean("myStaticBean", Monster.class);
        System.out.println(myStaticBean);
    }

    @Test
    public void setBeanByRelation() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Employee employee = ioc.getBean("employee", Employee.class);
        System.out.println(employee);
    }

    @Test
    public void setBeanByUtils() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        BookStore bookStore = ioc.getBean("bookStore", BookStore.class);
        System.out.println(bookStore);
    }

    @Test
    public void setBeanForList() {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        Master master = ioc.getBean("master", Master.class);
        System.out.println(master);
    }

    @Test
    public void setBeanByInner() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.直接传入class对象
        MemberServiceImpl memberService = ioc.getBean("memberService2", MemberServiceImpl.class);
        memberService.add();
    }

    @Test
    public void setBeanByRef() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.直接传入class对象
        MemberServiceImpl memberService = ioc.getBean("memberService", MemberServiceImpl.class);
        memberService.add();
    }

    @Test
    public void getBeanByP() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.直接传入class对象
        Monster bean = ioc.getBean("monster06", Monster.class);
        System.out.println(bean);
    }

    @Test
    public void getBeanByType() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.直接传入class对象
        Monster bean = ioc.getBean(Monster.class);
    }

    @Test
    public void setBeanByConstructor() {
        // 1.创建容器 ApplicationContext
        // 2.该容器和容器配置文件关联
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
        // 3.直接传入class对象
        Object bean = ioc.getBean("monster03", Monster.class);
        System.out.println(bean);
    }

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
