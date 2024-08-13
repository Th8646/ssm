package com.wpt.spring.depinjection;/**
 * @author wpt@onlying.cn
 * @date 2024/8/2 22:02
 */

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @projectName: spring
 * @package: com.wpt.spring.depinjection
 * @className: PhoneDao
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/2 22:02
 * @version: 1.0
 */
@Repository
public class PhoneDao extends BaseDao<Phone>{
    @Override
    public void save() {
        System.out.println("phone dao 的  save()");
    }
}
