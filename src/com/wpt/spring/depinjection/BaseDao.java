package com.wpt.spring.depinjection;/**
 * @author wpt@onlying.cn
 * @date 2024/8/2 22:00
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.depinjection
 * @className: BaseDao
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/2 22:00
 * @version: 1.0
 */
public abstract class BaseDao<T> {
    public abstract void save();
}
