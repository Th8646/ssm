package com.wpt.spring.component;/**
 * @author wpt@onlying.cn
 * @date 2024/8/1 16:34
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @projectName: spring
 * @package: com.wpt.spring.component
 * @className: UserServlet
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/1 16:34
 * @version: 1.0
 */
@Controller
public class UserAction {
    @Autowired
    private UserService userService;
    public  void sayOk(){
        System.out.println("UserAction 的sayOk()");
        userService.hi();
    }
}
