package com.base.module.javaproject.java.holding;

import java.util.LinkedList;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 下午3:10
 * @Description: 使用LinkedList 实现一个Stack的功能
 * stack 的特征：先进后出
 */
public class StackByLinkedList<T> {

    private LinkedList<T> storage = new LinkedList();

    public void push(T t) {
        storage.addLast(t);
    }

    public T pop() {
        return storage.removeLast();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    public static void main(String[] args) {
        StackByLinkedList<String> stackByLinkedList = new StackByLinkedList<>();
        stackByLinkedList.push("1");
        stackByLinkedList.push("2");
        stackByLinkedList.push("3");
        System.out.println("stackByLinkedList.toString() = " + stackByLinkedList.toString());

        System.out.println("stackByLinkedList.pop() = " + stackByLinkedList.pop());
        System.out.println("stackByLinkedList.toString() = " + stackByLinkedList.toString());
    }
}
