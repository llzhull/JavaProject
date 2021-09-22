package com.base.module.javaproject.java.polymorphism.music;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-30 下午2:03
 * @Description:
 */
public class Wind extends Instrument {
    @Override
    public void play(Note note) {
//        super.play(note);
        System.out.println("Wind.play note = "+note);
    }

    @Override
    String what() {
        return "wind";
    }
}
