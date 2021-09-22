package com.base.module.javaproject.java.interfaceDemo.music;

import androidx.annotation.NonNull;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 上午11:16
 * @Description:
 */
public class Wind implements Instrument{

    @Override
    public void play(Note note) {
        System.out.println(this+".play note = "+note);
    }

    @Override
    public void adjust() {

        System.out.println("Wind.adjust");
    }

    @NonNull
    @Override
    public String toString() {
        return "wind";
    }
}
