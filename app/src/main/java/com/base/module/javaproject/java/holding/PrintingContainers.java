package com.base.module.javaproject.java.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 上午11:24
 * @Description:
 */
public class PrintingContainers {
static Collection fill(Collection<String> collection){
    collection.add("a");
    collection.add("c");
    collection.add("b");
    collection.add("e");
    collection.add("d");
    collection.add("a");
    collection.add("b");
    return collection;
}

static Map fill(Map<String,String> map){
    map.put("a_id","a");
    map.put("c_id","c");
    map.put("b_id","c");
    map.put("a_id","aa");
    return map;
}

    /**
     * [a, c, b, e, d, a, b]
     * [a, c, b, e, d, a, b]
     * [a, b, c, d, e]
     * [a, b, c, d, e]
     * [a, c, b, e, d]
     * {a_id=aa, b_id=c, c_id=c}
     * {a_id=aa, b_id=c, c_id=c}
     * {a_id=aa, c_id=c, b_id=c}
     */
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        System.out.println(fill(list));
//        System.out.println(fill(new LinkedList<String>()));
//        System.out.println(fill(new HashSet<String>()));//有序，不允许重复
//        System.out.println(fill(new TreeSet<String>()));
//        System.out.println(fill(new LinkedHashSet<>()));//无序，不允许重复
//        System.out.println(fill(new HashMap<>()));
//        System.out.println(fill(new TreeMap<>()));
//        System.out.println(fill(new LinkedHashMap<>()));

//        Iterator<String> iterator=list.iterator();
//        while (iterator.hasNext()){
//            System.out.println("iterator.next() = " + iterator.next());
//            iterator.remove();
//        }
////        iterator=list.iterator();
////        for (int i = 0; i <3 ; i++) {
////            iterator.next();
////            iterator.remove();
////        }
//        System.out.println(list);

//        System.out.println("new LinkedList<String>(list) = " + new LinkedList<String>(list));
//        System.out.println("new TreeSet<String>(list) = " + new TreeSet<String>(list));
//        System.out.println(list);
//        System.out.println("new HashSet<String>(list) = " + new HashSet<String>(list));
        revert(list.listIterator());
    }
    static void revert(ListIterator<String> iterator){
        List<String> list=new ArrayList<>();
        while (iterator.hasNext()){
            iterator.next();
        }
        while (iterator.hasPrevious()){
            list.add(iterator.previous());
        }
        System.out.println("list = " + list);
    }
}


