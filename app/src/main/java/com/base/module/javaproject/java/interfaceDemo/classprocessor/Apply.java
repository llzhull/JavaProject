package com.base.module.javaproject.java.interfaceDemo.classprocessor;

import java.util.Arrays;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 上午11:46
 * @Description:
 */
public class Apply {
    /**
     * 根据所传递的参数对象的不同，而具有不同行为的方法，被成为策略模式
     * @param process
     * @param s
     */
    public static void process(Process process,Object s){
        System.out.println("process.name() = " + process.name());
        System.out.println(process.process(s));

    }
    public static String s= "I am a interface Apply demo";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}

class Process {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;

    }
}

class Upcase extends Process {
    @Override
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
class Downcase extends Process{
    @Override
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}
class Splitter extends Process{
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
