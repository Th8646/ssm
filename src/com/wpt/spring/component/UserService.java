package com.wpt.spring.component;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 16:34
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: spring
 * @package: com.wpt.spring.component
 * @className: UserService
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/1 16:34
 * @version: 1.0
 */
@Service
public class UserService {
    public void hi(){
        System.out.println("UserService hi()");
    }
}
