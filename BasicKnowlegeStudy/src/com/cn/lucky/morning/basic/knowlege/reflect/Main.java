package com.cn.lucky.morning.basic.knowlege.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Main
 *
 * @author wangchen
 * @group com.cn.lucky.morning.basic.knowlege.reflect
 * @date 2021/3/22 14:52
 */
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<DemoClass> mClass = DemoClass.class;
        Constructor<DemoClass> constructor = mClass.getConstructor();
        DemoClass demo = constructor.newInstance();

        for (Method method : mClass.getDeclaredMethods()) {
            System.out.println(method.getName());
        }

        for (Field field : mClass.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        Class<? super DemoClass> mSuperClass = mClass.getSuperclass();
        for (Field field : mSuperClass.getDeclaredFields()) {
            System.out.println(field.getName());
        }

        System.out.println(mSuperClass.getSuperclass().getSuperclass());
    }

    static class Parent{
        private String parent;

        public String getParent() {
            return parent;
        }

        public Parent(){
            super();
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        @Override
        public String toString() {
            return "Parent{" +
                    "parent='" + parent + '\'' +
                    '}';
        }
    }

    static class DemoClass extends Parent{
        private String name;

        private Integer order;

        public DemoClass(){
            super();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        @Override
        public String toString() {
            return "DemoClass{" +
                    "name='" + name + '\'' +
                    ", order=" + order +
                    '}';
        }
        private void testPrivateFunction(){
            System.out.println("调用：testPrivateFunction()");
        }
    }
}
