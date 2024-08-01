package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 9:01
 */

import java.util.*;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: Master
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 9:01
 * @version: 1.0
 */
public class Master {
    private String name;

    private List<Monster> monsterList;
    private Map<String, Monster> monsterMap;
    private Set<Monster> monsterSet;

    private String[] monsterName;
    //这个 Properties 是 Hashtable 的子类 , 是 key-value 的形式
    //这里 Properties key 和 value 都是 String
    private Properties pros;

    public Master() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public Map<String, Monster> getMonsterMap() {
        return monsterMap;
    }

    public void setMonsterMap(Map<String, Monster> monsterMap) {
        this.monsterMap = monsterMap;
    }

    public Set<Monster> getMonsterSet() {
        return monsterSet;
    }

    public void setMonsterSet(Set<Monster> monsterSet) {
        this.monsterSet = monsterSet;
    }

    public String[] getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String[] monsterName) {
        this.monsterName = monsterName;
    }

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + name + '\'' +
                ", monsterList=" + monsterList +
                ", monsterMap=" + monsterMap +
                ", monsterSet=" + monsterSet +
                ", monsterName=" + Arrays.toString(monsterName) +
                ", pros=" + pros +
                '}';
    }
}
