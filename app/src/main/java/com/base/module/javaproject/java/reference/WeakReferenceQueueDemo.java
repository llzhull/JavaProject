package com.base.module.javaproject.java.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-1 下午2:59
 * @Description:
 */
public class WeakReferenceQueueDemo {
    public static void main(String[] args) {
        ReferenceQueue<Apple> appleReferenceQueue=new ReferenceQueue<>();
        WeakReference<Apple> appleWeakReference=new WeakReference<>(new Apple("红苹果"),appleReferenceQueue);
        WeakReference<Apple> appleWeakReference1=new WeakReference<>(new Apple("青苹果"),appleReferenceQueue);
        System.out.println("gc 调用前");
        Reference<? extends Apple> reference=null;
        while ((reference=appleReferenceQueue.poll())!=null){
            //不会输出，因为没有回收 被弱引用的对象，并不会加入队列中
            System.out.println("reference = " + reference);
        }

        System.out.println("appleWeakReference = " + appleWeakReference);
        System.out.println("appleWeakReference1 = " + appleWeakReference1);
        System.out.println("appleWeakReference.get() = " + appleWeakReference.get());
        System.out.println("appleWeakReference1.get() = " + appleWeakReference1.get());

        System.out.println("调用 gc");
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("gc 调用后");

        //下面两个输出为空，这表示 对象被回收了
        System.out.println("appleWeakReference.get() = " + appleWeakReference.get());
        System.out.println("appleWeakReference1.get() = " + appleWeakReference1.get());

        Reference<? extends Apple> reference1=null;
        while ((reference1=appleReferenceQueue.poll())!=null){
            System.out.println("reference1 = " + reference1);
            System.out.println(reference1.get());
        }

    }
}
