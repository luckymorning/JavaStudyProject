package com.cn.luckymorning.study.function;

import java.util.function.Function;

/**
 * FunctionDemo
 *
 * @author lucky_morning
 * @group com.cn.luckymorning.study.function
 * @date 2020/8/21 11:56
 */
public class FunctionDemo {

    /**
     * 方法传递
     *
     * @param function 方法
     * @desc function对一个参数进行处理，返回第二个参数值
     */
    public static void applyFunction(Function<Long, String> function) {
        System.out.println("function: " + function.apply(System.currentTimeMillis()));
    }
}
