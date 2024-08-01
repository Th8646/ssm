package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 21:32
 */

import java.sql.SQLOutput;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: Cat
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 21:32
 * @version: 1.0
 */
public class Cat {
    private Integer id;
    private String name;

    public Cat() {
        System.out.println("Cat() 被调用....");
    }

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
