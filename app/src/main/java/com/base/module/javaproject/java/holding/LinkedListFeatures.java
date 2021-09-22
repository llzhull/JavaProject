package com.base.module.javaproject.java.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 下午2:30
 * @Description:
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        fill(linkedList);
        //todo add,尾插法 add=addLast
        linkedList.addFirst("first");
        linkedList.add("add");
        linkedList.addLast("addLast");

        System.out.println("linkedList = " + linkedList);


        //todo offer 尾插法，返回插入结果
        linkedList.offer("offer");
        linkedList.offerFirst("offerFirst");
        linkedList.offerLast("offerLast");
        System.out.println("after offer linkedList = " + linkedList);

        //todo set
        linkedList.set(1,"set");
        System.out.println("linkedList = " + linkedList);

        //todo get 第一个元素，获取但是不移除
        //todo getFirst=element , 列表为空时抛出异常
        //todo peek 列表为null时返回null，不抛出异常
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        System.out.println("linkedList.element() = " + linkedList.element());
        System.out.println("linkedList.peek() = " + linkedList.peek());
        System.out.println("after get linkedList = " + linkedList);

        //todo remove
        // todo remove 和 removeFirst 都是移除并返回列表头，列表为空时，抛出异常
        System.out.println("linkedList.remove() = " + linkedList.remove());
        System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());

        System.out.println("after remove linkedList = " + linkedList);
        // todo poll 移除返回列表头，列表为null时返回null，不抛出异常
        System.out.println("linkedList.poll() = " + linkedList.poll());

        System.out.println("after poll linkedList = " + linkedList);

    }
    static Collection fill(Collection<String> collection){
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        collection.add("e");
        return collection;
    }
}
