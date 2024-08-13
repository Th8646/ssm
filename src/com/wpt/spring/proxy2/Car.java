package com.wpt.spring.proxy2;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 21:05
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.proxy2
 * @className: Car
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 21:05
 * @version: 1.0
 */
public class Car implements Vehicle{
    @Override
    public void run() {
        //System.out.println("交通工具开始运行了....");
        System.out.println("小汽车在公路上 running....");
        //System.out.println("交通工具停止运行了.....");
    }
}
