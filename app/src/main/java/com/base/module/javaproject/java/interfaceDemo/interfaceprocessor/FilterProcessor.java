package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

import com.base.module.javaproject.java.interfaceDemo.filter.BandPass;
import com.base.module.javaproject.java.interfaceDemo.filter.Filter;
import com.base.module.javaproject.java.interfaceDemo.filter.HighPass;
import com.base.module.javaproject.java.interfaceDemo.filter.LowPass;
import com.base.module.javaproject.java.interfaceDemo.filter.Waveform;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:40
 * @Description:
 */
public class FilterProcessor {
    public static void main(String[] args) {
        Waveform waveform=new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)),waveform);
        Apply.process(new FilterAdapter(new HighPass(2.0)),waveform);
        Apply.process(new FilterAdapter(new BandPass(3.0,4.0)),waveform);
    }
}

class FilterAdapter implements Processor {
    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}
