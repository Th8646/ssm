package com.wpt.spring.factory;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 20:36
 */

import com.wpt.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: spring
 * @package: com.wpt.spring.Factory
 * @className: MyInstanceFactory
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 20:36
 * @version: 1.0
 */
public class MyInstanceFactory {
    private Map<String, Monster> monsterMap;
    //通过普通代码块进行初始化
    {
        monsterMap = new HashMap<>();
        monsterMap.put("monster01",new Monster(100,"牛魔王","芭蕉扇"));
        monsterMap.put("monster02",new Monster(200,"孙悟空","七十二变"));
        monsterMap.put("monster03",new Monster(200,"红孩儿","喷火"));
    }

    public Monster getMonster(String key){
        return monsterMap.get(key);
    }
}
