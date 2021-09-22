package com.base.module.javaproject.java.interfaceDemo;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午5:11
 * @Description:
 */
public class AllAbstractDemo {
    //静态方法
    public static Son changeToSon(Parent parent) {
        return (Son) parent;
    }

    public static void main(String[] args) {

//        Parent parent = new Son();
//        changeToSon(parent);
        new Son().get();
    }
}

abstract class Parent {
    public Parent() {
        System.out.println("Parent.Parent");
    }
}

class Son extends Parent {

    public Son() {
        System.out.println("Son.Son");
    }

    public void get() {
        changeToSon(this);
    }

    //静态方法
    public static Son changeToSon(Parent parent) {
        return (Son) parent;
    }
}

