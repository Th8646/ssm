package com.wpt.spring.depinjection;/**
 * @author wpt@onlying.cn
 * @date 2024/8/2 22:01
 */

import org.springframework.stereotype.Repository;

/**
 * @projectName: spring
 * @package: com.wpt.spring.depinjection
 * @className: BookDao
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/2 22:01
 * @version: 1.0
 */
@Repository
public class BookDao extends BaseDao<Book>{
    @Override
    public void save() {
        System.out.println("book   dao  save().....");
    }
}
