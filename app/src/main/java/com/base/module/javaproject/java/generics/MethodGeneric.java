package com.base.module.javaproject.java.generics;

import com.base.module.javaproject.java.utils.Generator;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-22 下午4:26
 * @Description:
 */
public class MethodGeneric {
    public static void main(String[] args) {
        MethodGeneric methodGeneric=new MethodGeneric();
        methodGeneric.genericMethod("aaa");
        methodGeneric.genericMethod(22);
        methodGeneric.genericMethod(22.0);
        methodGeneric.genericMethod(22.0f);
    }


    public <T> void genericMethod(T x){
        System.out.println("x.getClass().getSimpleName() = " + x.getClass().getSimpleName());
    }
}
