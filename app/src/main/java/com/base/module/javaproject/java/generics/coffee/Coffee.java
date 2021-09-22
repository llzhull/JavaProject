package com.base.module.javaproject.java.generics.coffee;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-10 下午8:15
 * @Description:
 */
public class Coffee {
    private static long counter=0;
    private final long id=counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName()+"  "+id;
    }
}
