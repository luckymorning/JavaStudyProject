package com.cn.lucky.morning.basic.knowlege.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Main
 *
 * @author wangchen
 * @group com.cn.lucky.morning.basic.knowlege.arrays
 * @date 2021/3/22 13:55
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getSimpleName());

    public static void main(String[] args) {
        lists();
    }

    private static void lists(){
        String[] strs = new String[]{"1", "2", "3"};
        List<String> list = Stream.of(strs).collect(Collectors.toList());
        list.add("4");

        logger.log(Level.INFO, list.toString());
    }

    private static void arrays(){

        String[] strs = new String[]{"1", "2", "3"};

        List<String> list = Arrays.asList(strs);

//         这里使用List.add() 会导致UnsupportedOperationException
//        list.add("4");
        logger.log(Level.INFO, list.toString());
    }
}
