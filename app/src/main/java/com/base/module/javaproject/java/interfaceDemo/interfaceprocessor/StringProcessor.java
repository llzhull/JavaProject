package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

import java.util.Arrays;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午1:57
 * @Description:
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract String process(Object input);

    public static String s = "I am learning java. I will be a good programmer";

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }
}

class Upcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
