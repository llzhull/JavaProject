package com.base.module.javaproject.java.generics.coffee;

import com.base.module.javaproject.java.utils.Generator;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-22 下午4:10
 * @Description:
 */
public class FruitGenerator<T> implements Generator<T> {

    public <T> void genericMethod(T x){
        System.out.println("x.getClass().getSimpleName() = " + x.getClass().getSimpleName());
    }
}
