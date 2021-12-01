package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-22 下午7:25
 * @Description:
 */
class Info<T>{
    private T t;
}
public class GenericDemo {
    public static void main(String[] args) {
        Info<Integer> integerInfo=new Info<>();
        Info<Double> doubleInfo=new Info<>();
        fun(integerInfo);
        fun(doubleInfo);

        Info<Apple> appleInfo=new Info<>();
        Info<Fruit> fruitInfo=new Info<>();
        Info<HongFuShi> hongFuShiInfo=new Info<>();
        funExtends(appleInfo);
//        funExtends(fruitInfo);
        funExtends(hongFuShiInfo);

        funSuper(appleInfo);
        funSuper(fruitInfo);
//        funSuper(hongFuShiInfo);

    }
    public static void fun(Info<? extends Number> info){
        System.out.println("info = " + info);
    }


    public static void funExtends(Info<? extends Apple> info){
        System.out.println("info = " + info);
    }
    public static void funSuper(Info<? super Apple> info){
        System.out.println("info = " + info);
    }
}
