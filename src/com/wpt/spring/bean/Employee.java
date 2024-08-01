package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 19:58
 */

import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: Employee
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 19:58
 * @version: 1.0
 */
public class Employee {
    private String name;
    private Dept dept;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
