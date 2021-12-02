package com.base.module.javaproject.java.collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * @Author: llzhu
 * @CreateDate: 21-12-1 下午3:22
 * @Description:
 */
public class ConcurrentMap {
    public static void main(String[] args) {
        Map<String,String> concurrentHashMap=new ConcurrentHashMap<>();
        //跳表，排好顺序的链表，
        ConcurrentSkipListMap<String,String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
    }
}
