package com.base.module.javaproject.java.reuse;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-25 下午3:53
 * @Description: final 关键字
 * 1、final 关键字修饰常量时，常量必须是基本数据类型，表示常量不可更改
 * 2、final 关键字修饰 对象时，对象的引用保持不变，也就是说
 * 一旦引用被初始化指向一个对象，就无法再把它改为指向另一个对象，但是对象本身是可以修改的
 * 3、static final 关键字修饰的变量，用大写表示，只会被初始化一次
 */
public class FinalDemo {
    private static Random random = new Random(47);
    private String id;

    public FinalDemo(String id) {
        this.id = id;
    }

    private final int valueOne = 19;
    //static final
    private static final int VALUE_TWO = 29;
    public static final int VALUE_THREE = 39;

    private final int int4 = random.nextInt(20);
    // static final 只会被初始化一次
    static final int INT_5 = random.nextInt(20);

    //对象
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VALUE_3 = new Value(33);
    public  final int[] a={1,2,3} ;

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", int4=" + int4 +
                ", INT_5=" + INT_5 +
                '}';
    }
    public static void main(String[] args) {

        FinalDemo fd1 = new FinalDemo("fd1");
        System.out.println(fd1);
//        fd1.valueOne++; //final 数据常亮 不能修改
        fd1.v1=new Value(111);
//        fd1.v2=new Value(222); // final 修饰的对象，引用不能修改
//        fd1.VALUE_3=new Value(333);
        fd1.v2.i++;//final 修饰的对象，对象的属性可以修改
        for (int i : fd1.a) {
            fd1.a[i-1]++;
        }
        System.out.println(Arrays.toString(fd1.a));


        FinalDemo fd2 = new FinalDemo("fd2");
        System.out.println(fd2);
    }
}

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

