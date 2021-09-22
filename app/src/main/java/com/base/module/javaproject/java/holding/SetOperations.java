package com.base.module.javaproject.java.holding;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 下午4:12
 * @Description:
 */
public class SetOperations {


    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        Collections.addAll(set,"a b c d e f g".split(" "));
        System.out.println("set = " + set);

        Set<String> set1=new HashSet<>();
        Collections.addAll(set1,"d e f g".split(" "));
        System.out.println("set1 = " + set1);

        System.out.println("set.contains(set1) = " + set.containsAll(set1));

        System.out.println("set.contains(\"a\") = " + set.contains("a"));
//        System.out.println("set.remove(set1) = " + set.remove(set1));
//        System.out.println(" set remove set1 set = " + set);
    }
}
