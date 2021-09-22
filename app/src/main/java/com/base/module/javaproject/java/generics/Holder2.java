package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-10 下午4:58
 * @Description:
 */
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {


        Holder2 holder2=new Holder2(new Automobile());

        Automobile automobile= (Automobile) holder2.get();
        holder2.set("Not an Automobile");
        String s= (String) holder2.get();

        holder2.set(1);
        Integer x= (Integer) holder2.get();


    }
}
