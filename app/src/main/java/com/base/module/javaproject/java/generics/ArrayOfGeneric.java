package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-23 下午2:33
 * @Description:
 */
public class ArrayOfGeneric {


   static Generic<Integer>[] generics;

    public static void main(String[] args) {
        generics=new Generic[10];
        System.out.println("generics.getClass() = " + generics.getClass());
        generics[0]=new Generic<Integer>();
        Generic<Integer> generic=new Generic<>(2);

        generics[0]=generic;
        System.out.println(generics[0].getKey());
    }
}
