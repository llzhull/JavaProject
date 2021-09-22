package com.base.module.javaproject.java.generics.coffee;

import java.util.Iterator;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-11 上午9:17
 * @Description:
 */
public class IteratorClass implements Iterable<String> {
    protected  String[] worlds="And that is how it works".split(" ");
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int index=0;
            public boolean hasNext() {
                return index<worlds.length;
            }

            public String next() {
                return worlds[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(String s:new IteratorClass()){

        }
    }
}
