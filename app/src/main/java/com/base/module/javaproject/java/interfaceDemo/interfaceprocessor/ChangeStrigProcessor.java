package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:58
 * @Description:
 */
public class ChangeStrigProcessor {
    public static void main(String[] args) {
        Apply.process(new ChangeString(), "012");
    }
}

class ChangeString implements Processor {


    public String change(String s) {
        final char c1 = s.charAt(0);
        final char c2 = s.charAt(1);
        s = s.replace(c1, '-');
        s = s.replace(c2, c1);
        s = s.replace('-', c2);
        return s;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String process(Object input) {
        return change((String) input);
    }
}
