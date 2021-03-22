package com.cn.lucky.morning.basic.knowlege.function;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FunctionValuePassExample
 *
 * @author wangchen
 * @group com.cn.lucky.morning.basic.knowlege.function
 * @date 2021/3/19 15:11
 */
public class FunctionValuePassExample {

    private static final Logger LOGGER = Logger.getLogger(FunctionValuePassExample.class.getSimpleName());

    private FunctionValuePassExample() {
        super();
    }

    /**
     * 启动防范
     *
     * @param args 启动参数
     */
    public static void main(String[] args) {
        // 对象值修改
        int value = 10;
        LOGGER.log(Level.INFO,"调用方法前值：{0}" , value);
        changeValue(value);
        LOGGER.log(Level.INFO,"调用方法后值：{0}" , value);

        // 数组内容值修改
        List<Integer> values = Arrays.asList(1,2,3);
        LOGGER.log(Level.INFO,"调用方法前值：{0}" , values);
        changeValue(values);
        LOGGER.log(Level.INFO,"调用方法后值：{0}" , values);
    }

    /**
     * 修改值
     *
     * @param value 待修改值
     */
    private static void changeValue(int value) {
        value *= 10;
    }

    /**
     * 修改数组内部值
     * @param values 数组
     */
    private static void changeValue(List<Integer> values){
        for (int index = 0; index < values.size(); index++) {
            values.set(index,values.get(index) * 10);
        }
    }

}
