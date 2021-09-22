package com.base.module.javaproject.java.interfaceDemo;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午5:16
 * @Description:
 */
public class PrintDemo {
    public static void main(String[] args) {
        SubPrint subPrint=new SubPrint();
        subPrint.print();
    }
}
abstract class SuperPrint{
    public SuperPrint() {
        print();
    }

    abstract void print();
}

class SubPrint extends SuperPrint{
    private int level=2;


    @Override
    void print() {
        System.out.println("level = " + level);
    }
}
