package com.wpt.spring.factory;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 20:18
 */

import com.wpt.spring.bean.Monster;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: spring
 * @package: com.wpt.spring.Factory
 * @className: MyStaticFactory
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 20:18
 * @version: 1.0
 */
public class MyStaticFactory {
    private static Map<String, Monster> monsterMap;

    //使用static代码块初始化
    static {
        monsterMap = new HashMap<>();
        monsterMap.put("monster01",new Monster(100,"牛魔王","芭蕉扇"));
        monsterMap.put("monster02",new Monster(200,"孙悟空","七十二变"));
    }
    public static Monster getMonster(String key){
        return monsterMap.get(key);
    }
}
