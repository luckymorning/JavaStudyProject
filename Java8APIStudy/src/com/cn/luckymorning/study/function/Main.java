package com.cn.luckymorning.study.function;

/**
 * Main
 * 函数式编程学习主运行类
 *
 * @author lucky_morning
 * @group com.cn.luckymorning.study.function
 * @date 2020/8/21 11:46
 */
public class Main {
    public static void main(String[] args) {
        ConsumerDemo.acceptLong(it -> System.out.println("consumer:" + it));

        FunctionDemo.applyFunction(aLong -> "function:" + aLong);
    }
}
