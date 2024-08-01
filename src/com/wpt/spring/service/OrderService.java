package com.wpt.spring.service;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 14:29
 */

import com.wpt.spring.dao.OrderDao;

/**
 * @projectName: spring
 * @package: com.wpt.spring.service
 * @className: OrderService
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/1 14:29
 * @version: 1.0
 */
public class OrderService {
    private OrderDao orderDao;

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}

