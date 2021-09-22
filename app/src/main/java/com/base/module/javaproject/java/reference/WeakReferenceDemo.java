package com.base.module.javaproject.java.reference;


/**
 * @Author: llzhu
 * @CreateDate: 21-9-1 上午11:58
 * @Description:
 */
public class WeakReferenceDemo {


    public static void main(String[] args) {
       Salad salad=new Salad(new Apple("红富士"));
        System.out.println(salad.get());

        System.gc();
        try {
            //休眠一下，在运行的时候加上虚拟机参数-XX:+PrintGCDetails，输出gc信息，确定gc发生了。
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (salad.get()==null){
            System.out.println("apple cleared");
        }
    }
}
