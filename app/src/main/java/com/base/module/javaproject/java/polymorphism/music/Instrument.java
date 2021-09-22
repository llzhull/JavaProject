package com.base.module.javaproject.java.polymorphism.music;

import androidx.annotation.NonNull;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-30 下午1:57
 * @Description:
 */
public class Instrument {

    public void play(Note note){
        System.out.println("Instrument.play");
    }
    String what(){
        return "Instrument";
    }

    @NonNull
    @Override
    public String toString() {
        return what();
    }
}
