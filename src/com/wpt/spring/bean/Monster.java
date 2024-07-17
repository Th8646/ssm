package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/18 0:58
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring
 * @className: Monster
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/18 0:58
 * @version: 1.0
 */
public class Monster {
    private Integer monsterId;
    private String name;
    private String kill;

    // Spring创建时，需要使用无参构造器
    public Monster() {
    }

    public Monster(Integer monsterId, String name, String kill) {
        this.monsterId = monsterId;
        this.name = name;
        this.kill = kill;
    }

    public Integer getMonsterId() {
        return monsterId;
    }

    public void setMonsterId(Integer monsterId) {
        this.monsterId = monsterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKill() {
        return kill;
    }

    public void setKill(String kill) {
        this.kill = kill;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterId=" + monsterId +
                ", name='" + name + '\'' +
                ", kill='" + kill + '\'' +
                '}';
    }
}
