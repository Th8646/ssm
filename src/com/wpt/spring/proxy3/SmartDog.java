package com.wpt.spring.proxy3;/**
 * @author wpt@onlying.cn
 * @date 2024/8/5 22:26
 */

/**
 * @projectName: spring
 * @package: com.wpt.spring.aop.proxy
 * @className: SmartDog
 * @author: wpt
 * @description: TODO
 * @date: 2024/8/5 22:26
 * @version: 1.0
 */
public class SmartDog implements SmartAnimalable {
    @Override
    public float getSum(float i, float j) {
        System.out.println("日志-方法名-getSum  " + "i" + " " + "j");
        float result = i + j;
        System.out.println("方法内部打印result = " + result);
        System.out.println("日志-方法名-getSum-结果result=" + result);
        return result;
    }

    @Override
    public float getSub(float i, float j) {
        //System.out.println("日志-方法名-getSub  " + "i" + " " + "j");
        float result = i - j;
        System.out.println("方法内部打印result = " + result);
        //System.out.println("日志-方法名-getSub-结果result=" + result);
        return result;
    }
}
