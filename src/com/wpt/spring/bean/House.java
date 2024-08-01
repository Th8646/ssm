package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 21:54
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: House
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 21:54
 * @version: 1.0
 */
public class House {
    private String name;

    public House() {
        System.out.println("House()构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("House setName = " + name);
        this.name = name;
    }
    public void init(){
        //根据业务逻辑
        System.out.println("House init..");
    }
    public void destroy(){
        System.out.println("House destroy...");
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                '}';
    }
}
