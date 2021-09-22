package com.base.module.javaproject.java.holding;

import java.util.ArrayList;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-8 下午3:32
 * @Description:
 */
public class WithoutGeneric {
    public static void main(String[] args) {
//        ArrayList arrayList=new ArrayList();
//        arrayList.add(new Apple());
//        arrayList.add(new Orange());
//        for (Object o : arrayList) {
//            Apple apple= (Apple) o;
//        }
        
        ArrayList<Apple> apples=new ArrayList<>();
        apples.add(new Apple());
//        apples.add(new Orange());
        for (Apple apple : apples) {
            
        }
    }

}
class Apple{
    private int id;

    public int getId() {
        return id;
    }
}
class Orange{

}
