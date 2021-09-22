package com.base.module.javaproject.java.reference;

import java.lang.ref.WeakReference;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-1 下午2:08
 * @Description:
 * 继承WeakReference，将Apple作为弱引用
 * gc的时候，回收的是Apple，而不是 Salad
 */
public class Salad extends WeakReference<Apple> {
    public Salad(Apple referent) {
        super(referent);
    }
}
