package com.cn.luckymorning.study.optional;

import java.util.Optional;
import java.util.logging.Logger;

/**
 * OptionalDemo
 *
 * @author lucky_morning
 * @group com.cn.luckymorning.study.optional
 * @date 2020/8/21 13:51
 */
class OptionalDemo {

    private static final Logger LOGGER = Logger.getLogger(OptionalDemo.class.getName());

    private OptionalDemo(){
        super();
    }

    /**
     * @param obj 请求参数
     * @return 返回结果
     */
    public static String testOptionalOrElse(Object obj) {
        Object defaultObj = "OrElse空对象";
        return Optional.ofNullable(obj).orElse(defaultObj).toString();
    }

    /**
     * @param obj 请求参数
     * @return 返回结果
     */
    public static String testOptionalOrElseGet(Object obj) {
        return Optional.ofNullable(obj).orElse("OrElseGet空对象").toString();
    }

    /**
     * @param obj 请求参数
     */
    public static void testOptionalIfPresent(Object obj) {
        Optional.ofNullable(obj).ifPresent(it -> LOGGER.info("IfPresent:" + it));

    }
}
