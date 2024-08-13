package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/14 0:03
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: Phone
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/14 0:03
 * @version: 1.0
 */
@Component
public class Phone implements UsbInterface{
    @Override
    public void work() {
        System.out.println("手机开始工作");
    }
}
