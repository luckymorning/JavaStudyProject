package com.cn.luckymorning.study.optional;


/**
 * Main
 *
 * @author lucky_morning
 * @group com.cn.luckymorning.study.optional
 * @date 2020/8/21 13:51
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(OptionalDemo.testOptionalOrElse(null));
        System.out.println(OptionalDemo.testOptionalOrElseGet(null));
        OptionalDemo.testOptionalIfPresent("哈哈哈");
        OptionalDemo.testOptionalIfPresent(null);
    }
}
