package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 19:57
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: Dept
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 19:57
 * @version: 1.0
 */
public class Dept {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
