package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/30 21:58
 */

import java.math.BigDecimal;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: Car
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/30 21:58
 * @version: 1.0
 */
public class Car {
    private String id;
    private String name;
    private BigDecimal price;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
