package com.base.module.javaproject.java.generics.coffee;

import com.base.module.javaproject.java.utils.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-10 下午8:19
 * @Description:
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    private Class[] type = {Latte.class, Mocha.class, Cappuccino.class};
    private static Random random = new Random(47);

    public CoffeeGenerator() {
    }

    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }
    public Coffee next(){
        try {
            return (Coffee) type[random.nextInt(type.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

//
//    @Override
//    public boolean hasNext() {
//        return false;
//    }
//
//    @Override
//    public Coffee next() {
//        try {
//            return (Coffee) type[random.nextInt(type.length)].newInstance();
//        } catch (Exception e) {
//            throw new RuntimeException();
//        }
//    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;

            return CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 10; i++) {
            System.out.println(coffeeGenerator.next());


//            for (Coffee coffee:new CoffeeGenerator(3)){
//                System.out.println("coffee = " + coffee);
//
//            }
        }
    }
}
