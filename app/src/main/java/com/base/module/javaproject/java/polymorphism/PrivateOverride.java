package com.base.module.javaproject.java.polymorphism;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午2:52
 * @Description:
 */
public class PrivateOverride {
    private String getName(){
        return "privateOverride getName";
    }
    public String getAge(){
        return "privateOverride public getAge";
    }
    public static void main(String[] args) {
       PrivateOverride privateOverride=new Deriver();
        System.out.println("privateOverride.getName() = " + privateOverride.getName());
        System.out.println("privateOverride.getAge() = " + privateOverride.getAge());
    }
}

class Deriver extends PrivateOverride{
    private String getName(){
        return "Deriver private getName";
    }
    public String getAge(){
        return "Deriver public  getAge";
    }
}

