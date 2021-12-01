package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-10 下午5:33
 * @Description: 泛型
 *
 * 我们希望定义的时候不指定类型，而是在使用的时候再指定类型
 *
 * 核心概念：告诉编译器想使用什么类型，然后编译器帮你处理一切细节
 *
 */
public class Holder3<T>{
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        //当创建holder3 对象时，必须指明创建什么类型，放在尖括号内，
        //当从holder3 中取出对象时，自动就是正确的类型，不用强转

//        Holder3<Automobile> holder3=new Holder3<>(new Automobile());
//        Automobile automobile = holder3.get();
//        System.out.println("automobile = " + automobile);
//
//
//        Holder3<String> holder31=new Holder3<>("aaaa");
//        System.out.println("holder31.get() = " + holder31.get());

        Holder3<Apple> apple=new Holder3<>(new Apple());
//        Holder3<? extends Fruit> fHolder =new Holder3<>(new Apple());
        Holder3<? extends Fruit> fHolder =apple;
        System.out.println("fHolder.get() = " + fHolder.get());
        fHolder.get();


    }
}
