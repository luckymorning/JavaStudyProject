package com.cn.luckymorning.study.function;

import java.util.function.Consumer;

/**
 * ConsumerDemo
 * 消费者demo
 *
 * @author lucky_morning
 * @group com.cn.luckymorning.study.function
 * @date 2020/8/21 11:49
 */
public class ConsumerDemo {

    private ConsumerDemo() {

    }

    /**
     * 接收Long值
     *
     * @param consumer 消费者
     * @desc 接收方法内返回值
     */
    public static void acceptLong(Consumer<Long> consumer) {
        consumer.accept(System.currentTimeMillis());
    }

}
