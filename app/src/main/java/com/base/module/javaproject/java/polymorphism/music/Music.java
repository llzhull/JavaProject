package com.base.module.javaproject.java.polymorphism.music;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-30 下午2:05
 * @Description:
 */
public class Music {
    public static void tune(Instrument instrument){
        instrument.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind wind=new Wind();
        Brass brass=new Brass();
        tune(wind);
        tune(brass);
        System.out.println("Music.main wind = "+wind);
        System.out.println("Music.main brass = "+brass);
    }
}
