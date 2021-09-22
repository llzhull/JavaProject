package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-14 下午5:04
 * @Description: 为了调用HasF 的 f() 方法，需要协助泛型类，给定泛型类的边界，告知编译器只能遵循这个边界的类型
 * 重用extends关键字
 */
public class Manipulation2 {
    public static void main(String[] args) {


        HasF hasF=new HasF();
        Manipulator2<HasF> manipulator2=new Manipulator2<>(hasF);
        manipulator2.manipulate();
    }
}

/**
 * T 必须具有类型HasF 或者 从HasF 导出的类
 * @param <T>
 */
class Manipulator2 <T extends HasF>{
    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    public void manipulate(){
        obj.f();
    }
}
