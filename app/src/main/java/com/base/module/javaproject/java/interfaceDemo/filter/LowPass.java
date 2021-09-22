package com.base.module.javaproject.java.interfaceDemo.filter;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:22
 * @Description:
 */
public class LowPass extends Filter{
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
