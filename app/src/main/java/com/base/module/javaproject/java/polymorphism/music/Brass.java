package com.base.module.javaproject.java.polymorphism.music;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-30 下午2:39
 * @Description:
 */
public class Brass extends Instrument{
    @Override
    public void play(Note note) {
        System.out.println("Brass.play note = " + note);
    }

    @Override
    String what() {
        return "brass";
    }
}
