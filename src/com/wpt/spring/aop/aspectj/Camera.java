package com.wpt.spring.aop.aspectj;/**
 * @author wpt@onlying.cn
 * @date 2024/8/14 0:04
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.aspectj
 * @className: Camera
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/14 0:04
 * @version: 1.0
 */
@Component
public class Camera implements UsbInterface{
    @Override
    public void work() {
        System.out.println("相机开始工作");
    }
}
