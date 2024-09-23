package com.wpt.spring.aop.homework.xml;/**
 * @author wpt@onlying.cn
 * @date 2024/8/19 21:46
 */

import org.springframework.stereotype.Component;

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.homework
 * @className: MyCal
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/19 21:46
 * @version: 1.0
 */
@Component
public class MyCal implements Cal {

    @Override
    public int cal1(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res += i;
        }
        System.out.println("Cal1执行结果 = " + res);
        return res;
    }

    @Override
    public int cal2(int n) {
        int res = 1;
        for (int i = 1; i < n-1; i++) {
            res *= i;
        }
        System.out.println("Cal2执行结果 = " + res);
        return res;
    }
}
