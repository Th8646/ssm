package com.wpt.spring.wptapplicationcontext;/**
 * @author wpt@onlying.cn
 * @date 2024/7/30 21:03
 */

import org.dom4j.DocumentException;

/**
 * @projectName: spring
 * @package: com.wpt.spring.wptapplicationcontext
 * @className: WptApplicationContextTest
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/30 21:03
 * @version: 1.0
 */
public class WptApplicationContextTest {
    public static void main(String[] args) throws Exception {
        WptApplicationContext wptApplicationContext = new WptApplicationContext("beans.xml");
        System.out.println("ok");
        Object bean = wptApplicationContext.getBean("monster01");
        System.out.println(bean);
    }
}
