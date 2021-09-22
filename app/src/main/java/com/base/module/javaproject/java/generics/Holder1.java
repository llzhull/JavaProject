package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-10 下午4:55
 * @Description: 持有单个对象的类
 */
public class Holder1 {
    private Automobile automobile;

    public Holder1(Automobile automobile) {
        this.automobile = automobile;
    }

    public Automobile getAutomobile() {
        return automobile;
    }
}

class Automobile {
}