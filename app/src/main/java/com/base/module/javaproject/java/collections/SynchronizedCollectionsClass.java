package com.base.module.javaproject.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: llzhu
 * @CreateDate: 21-12-1 下午2:29
 * @Description:
 *
 * Vector && Hashtab  所有的方法都使用 synchronized  关键字修饰
 * Collections 这个工具类，可以使非线程安全的集合转换成线程安全的集合
 * ConCurrentHashMap 和 ConCurrentQueue
 *
 * 选择场景分析
 * 运行时间短、并发量大的时候，选择 ConCurrentHashMap 和 ConCurrentQueue
 * 运行时间长、并发量小的时候，选择 synchronized
 *
 */
public class SynchronizedCollectionsClass {
    public static void main(String[] args) {
        SynchronizedCollectionsClass synchronizedCollectionsClass=new SynchronizedCollectionsClass();
    }

    public void initCollections(){
        Map<String,String> hashMap=new HashMap<>();
        Map<String, String> synchronizedMap = Collections.synchronizedMap(hashMap);

        ArrayList<String> arrayList=new ArrayList<>();
        List<String> list = Collections.synchronizedList(arrayList);
    }

    public void initHashtable(){
        Hashtable<String,String> hashtable=new Hashtable<>();
    }

    /**
     *效率高在读上面，即get方法上
     */
    public void initConcurrentHashMap(){
        ConcurrentHashMap<String,String > concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put("","");
        concurrentHashMap.remove("");

        ConcurrentLinkedQueue<String> concurrentLinkedQueue=new ConcurrentLinkedQueue<>();
        //获取并移除该队列的头部,如果队列为空，则返回null,使用cas
        concurrentLinkedQueue.poll();
    }

    public void initVector(){
        Vector<String> vector=new Vector<>();
        vector.add("111");
        vector.remove("111");
        vector.size();
    }
    public void initCopyOnWriteArrayList(){
        CopyOnWriteArrayList<String> copyOnWriteArrayList=new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add("111");
        copyOnWriteArrayList.remove("111");


    }
}
