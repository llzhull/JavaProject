package com.base.module.javaproject.java.interfaceDemo.filter;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:33
 * @Description:
 */
public class BandPass extends Filter{
    double lowCutoff,hightCutoff;

    public BandPass(double lowCutoff, double hightCutoff) {
        this.lowCutoff = lowCutoff;
        this.hightCutoff = hightCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
