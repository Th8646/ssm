package com.wpt.spring.test;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 21:37
 */

import com.wpt.spring.annotation.WptSpringApplicationContext;
import com.wpt.spring.annotation.WptSpringConfig;
import org.junit.Test;

/**
 * @projectName: spring
 * @package: com.wpt.spring.test
 * @className: WptApplicationContextTest
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/1 21:37
 * @version: 1.0
 */
public class WptApplicationContextTest {
    public static void main(String[] args) {
        WptSpringApplicationContext ioc = new WptSpringApplicationContext(WptSpringConfig.class);
        Object bean = ioc.getBean("UserAction");
        System.out.println(bean);
        System.out.println("ok");
    }
}
