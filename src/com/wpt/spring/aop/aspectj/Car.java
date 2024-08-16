package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/15 23:19
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: Car
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/15 23:19
 * @version: 1.0
 */
@Component
public class Car {

    public void run(){
        System.out.println("小汽车在running...");
    }
}
