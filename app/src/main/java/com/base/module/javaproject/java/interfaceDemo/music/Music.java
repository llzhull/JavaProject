package com.base.module.javaproject.java.interfaceDemo.music;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 上午11:22
 * @Description:
 */
public class Music {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] instruments) {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {

        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(instruments);
    }
}
