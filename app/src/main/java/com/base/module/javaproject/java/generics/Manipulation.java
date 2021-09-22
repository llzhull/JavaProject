package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-14 下午4:35
 * @Description: 泛型擦除
 */
public class Manipulation {
    public static void main(String[] args) {
        HasF hasF=new HasF();
        Manipulator<HasF> manipulator=new Manipulator<>(hasF);
        manipulator.nanipulate();
    }
}

class Manipulator<T>{
    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }
    public void nanipulate(){
        //error: cannot find symbol obj.f();
//        obj.f();
    }
}
