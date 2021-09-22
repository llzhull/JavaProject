package com.base.module.javaproject.java.interfaceDemo.filter;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:24
 * @Description:
 */
public class HighPass extends Filter{
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }

    @Override
    public String toString() {
        return "HighPass{" +
                "cutoff=" + cutoff +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("HighPass cutoff = " + cutoff);
    }
}
