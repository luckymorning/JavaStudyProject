package com.cn.lucky.morning.basic.knowlege.equels;

import java.util.Objects;

/**
 * Student
 *
 * @author wangchen
 * @group com.cn.lucky.morning.basic.knowlege.equels
 * @date 2021/3/19 16:02
 */
public class Student {
    private String name;

    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(number, student.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }
}
