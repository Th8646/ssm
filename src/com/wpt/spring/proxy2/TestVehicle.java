package com.wpt.spring.proxy2;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 21:07
 */

import org.junit.Test;

/**
 * @projectName: spring
 * @package: com.wpt.spring.proxy2
 * @className: TestVehicle
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 21:07
 * @version: 1.0
 */
public class TestVehicle {
    @Test
    public void run() {
        Vehicle vehicle = new Car();
        Ship ship = new Ship();

        ship.run();
        System.out.println("======================");
        vehicle.run();

    }

    @Test
    public void proxyRun() {
        // 创建对象
        Vehicle vehicle = new Ship();
        // 创建VehicleProxyProvider对象，传入要代理的对象
        VehicleProxyProvider provider = new VehicleProxyProvider(vehicle);
        // 获取代理对象，并调用
        // proxyd的编译类型是Vehicle，运行类型是代理类型
        Vehicle proxy = provider.getProxy();
        proxy.run();
    }
}
