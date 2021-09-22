package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午2:03
 * @Description:
 */
public class Apply {
   public static void process(Processor processor,Object input){
       System.out.println("processor.name() = " + processor.name());
       System.out.println("processor.process(input) = " + processor.process(input));
   }
}
