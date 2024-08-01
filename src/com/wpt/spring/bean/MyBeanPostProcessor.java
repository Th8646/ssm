package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 22:23
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: MyBeanPostProcessor
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 22:23
 * @version: 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * @param bean     传入的IoC容器中创建/配置的Bean
     * @param beanName 传入的IoC容器中创建/配置的bean的id
     * @return Object 对传入的bean进行修改、处理，返回
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization()... bean = " + bean + "beanName=" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization()... bean = " + bean + "beanName=" + beanName);
        return bean;
    }
}
