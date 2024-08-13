package com.wpt.spring.aop.proxy;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 22:31
 */

import org.junit.Test;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.proxy
 * @className: AopTest
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 22:31
 * @version: 1.0
 */
public class AopTest {
    @Test
    public void smartDogTest(){
        SmartDog smartDog = new SmartDog();
        MyProxyProvider myProxyProvider = new MyProxyProvider(smartDog);
        myProxyProvider.getProxy().getSum(10,2);
        myProxyProvider.getProxy().getSub(10,2);
    }
}
