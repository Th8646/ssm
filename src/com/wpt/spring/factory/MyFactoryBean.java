package com.wpt.spring.factory;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 20:56
 */

import com.wpt.spring.bean.Monster;
import org.springframework.beans.factory.FactoryBean;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: spring
 * @package: com.wpt.spring.factory
 * @className: MyFactoryBean
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 20:56
 * @version: 1.0
 */
public class MyFactoryBean implements FactoryBean<Monster> {
    private String key; // 配置Monster对象时获取的对象，对应的key
    private Map<String,Monster> monsterMap;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Map<String, Monster> getMonsterMap() {
        return monsterMap;
    }

    public void setMonsterMap(Map<String, Monster> monsterMap) {
        this.monsterMap = monsterMap;
    }

    {
        monsterMap = new HashMap<>();
        monsterMap.put("monster01",new Monster(100,"牛魔王","芭蕉扇"));
        monsterMap.put("monster02",new Monster(200,"孙悟空","七十二变"));
        monsterMap.put("monster03",new Monster(200,"红孩儿","喷火"));
    }
    @Override
    public Monster getObject() throws Exception {
        return monsterMap.get(key);
    }

    @Override
    public Class<?> getObjectType() {
        return monsterMap.get(key).getClass();
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
