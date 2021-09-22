package com.base.module.javaproject.java.interfaceDemo.music;

import androidx.annotation.NonNull;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 上午11:18
 * @Description:
 */
public class Percussion implements Instrument{
    @Override
    public void play(Note note) {
        System.out.println(this+".play note = "+note);
    }

    @Override
    public void adjust() {
        System.out.println("Percussion.adjust");
    }

    @NonNull
    @Override
    public String toString() {
        return "percussion";
    }
}
