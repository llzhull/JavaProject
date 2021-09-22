package com.base.module.javaproject.java.interfaceDemo.filter;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:18
 * @Description:
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
