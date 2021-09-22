package com.base.module.javaproject.java.interfaceDemo.filter;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:16
 * @Description:
 */
public class Waveform {
    private static long counter=1;
    private final long id=counter++;

    public Waveform() {
        System.out.println("counter = " + counter);
        System.out.println("id = " + id);
    }

    @Override
    public String toString() {
        return "Waveform{" +
                "id=" + id +
                '}';
    }
}
