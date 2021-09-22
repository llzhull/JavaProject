package com.base.module.javaproject.java.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 上午10:50
 * @Description:
 */
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

        Integer[] moreInts = {5, 6, 7, 8};


        collection.addAll(Arrays.asList(moreInts));


        Collections.addAll(collection, moreInts);
        Collections.addAll(collection, 10, 11, 12);
        for (Integer integer : collection) {
            System.out.println("integer = " + integer);
        }

        //todo 底层是数组，不能调整尺寸，通过add delete 去试图修改数组尺寸，会报错
        List<Integer> list=Arrays.asList(1,2,3,4);
        list.set(1,55);
        //todo Exception in thread "main" java.lang.UnsupportedOperationException
//        list.add(20);

    }
}
