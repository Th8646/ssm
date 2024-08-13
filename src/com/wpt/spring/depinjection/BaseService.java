package com.wpt.spring.depinjection;/**
 * @author wpt@onlying.cn
 * @date 2024/8/2 22:04
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: com.wpt.spring.depinjection
 * @className: BaseService
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/2 22:04
 * @version: 1.0
 */
public class BaseService<T> {
    @Autowired
    private BaseDao<T> baseDao;
    public void save() {
        baseDao.save();
    }
}