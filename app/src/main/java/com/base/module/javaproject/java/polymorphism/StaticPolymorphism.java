package com.base.module.javaproject.java.polymorphism;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午2:14
 * @Description: static 修饰的方法不具有多态性
 * 静态方法是与类相关联的，而不是与单个对象相关联的
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper staticSuper=new StaticSub();
        System.out.println("staticSuper.dynamicGet() = " + staticSuper.dynamicGet());
        System.out.println("staticSuper.staticGet() = " + staticSuper.staticGet());
        StaticSub staticSub=new StaticSub();
        System.out.println("staticSub.dynamicGet() = " + staticSub.dynamicGet());
        System.out.println("staticSub.staticGet() = " + staticSub.staticGet());
    }
}
class StaticSuper{
    public static String staticGet(){
        return "StaticSuper staticGet()";
    }
    public String dynamicGet(){
        return " StaticSuper dynamicGet()";
    }
}
class StaticSub extends StaticSuper{
    @Override
    public String dynamicGet() {
        return "StaticSub dynamicGet()";
    }
    public static String staticGet(){
        return "StaticSub staticGet()";
    }
}
