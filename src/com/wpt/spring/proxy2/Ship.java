package com.wpt.spring.proxy2;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 21:06
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.proxy2
 * @className: Ship
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 21:06
 * @version: 1.0
 */
public class Ship implements Vehicle{
    @Override
    public void run() {
        //System.out.println("交通工具开始运行了....");
        System.out.println("大轮船在海上 running....");
        //System.out.println("交通工具停止运行了.....");
    }
}
