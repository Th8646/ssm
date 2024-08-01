package com.wpt.spring.web;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 14:32
 */

import com.wpt.spring.service.OrderService;

/**
 * @projectName: spring
 * @package: com.wpt.spring.web
 * @className: OrderAction
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/1 14:32
 * @version: 1.0
 */
public class OrderAction {
    private OrderService orderService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
