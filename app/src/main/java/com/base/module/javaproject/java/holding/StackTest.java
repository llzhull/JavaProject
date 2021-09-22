package com.base.module.javaproject.java.holding;

import java.util.Stack;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 下午3:26
 * @Description:
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stringStack=new Stack<>();

        for(String string:"My dog name is dahuang".split(" ")){
            stringStack.push(string);

        }
        while (!stringStack.isEmpty()){
            System.out.print(stringStack.pop()+" ");
        }
        System.out.println();
    }
}
