package com.wpt.spring.wptapplicationcontext;/**
 * @author wpt@onlying.cn
 * @date 2024/7/30 20:57
 */

import com.wpt.spring.bean.Monster;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.lang.model.element.NestingKind;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @projectName: spring
 * @package: com.wpt.spring.wptapplicationcontext
 * @className: WptApplicationContext
 * @author: wpt
 * @description: 实现Spring容器的简单机制
 * 主要演示如何将beans.xml文件进行解析，并生成对象，放入容器中
 * 提供一个方法getBeans(id) 返回对应的对象
 */
public class WptApplicationContext {
    private ConcurrentHashMap<String, Object> singleObjects = new ConcurrentHashMap<>();

    // 构造器
    // 接收容器的配置文件，默认在src下
    public WptApplicationContext(String iocBeanXmlFile) throws Exception {
        // 1.得到类加载路径
        String path = this.getClass().getResource("/").getPath();
        System.out.println("path=" + path);
        // 2.生成SaxReader
        SAXReader saxReader = new SAXReader();
        // 3.得到Document对象
        Document document = saxReader.read(new File(path + iocBeanXmlFile));
        // 4.得到rootDocument
        Element rootElement = document.getRootElement();
        // 5.得到第一个bean
        Element bean = (Element) rootElement.elements("bean").get(0);
        // 6.得到bean的相关属性
        String id = bean.attributeValue("id");
        String classFullPath = bean.attributeValue("class");
//        System.out.println(id + classFullPath);
        List<Element> property = bean.elements("property");
        Integer monsterId = Integer.parseInt(property.get(0).attributeValue("value"));
        String name = property.get(1).attributeValue("value");
        String skill = property.get(2).attributeValue("value");
//        System.out.println(monsterId + name + skill);
        // 7.使用反射创建对象
        Class<?> aClass = Class.forName(classFullPath);
        Monster o = (Monster) aClass.newInstance();

        // 反射赋值
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            Object invoke = declaredMethod.invoke();
//        }
        o.setMonsterId(monsterId);
        o.setName(name);
        o.setKill(skill);
        // 8.将创建的对象放入singleObjects
        singleObjects.put(id,o);

    }
    public Object getBean(String id){
        return singleObjects.get(id);
    }

}
