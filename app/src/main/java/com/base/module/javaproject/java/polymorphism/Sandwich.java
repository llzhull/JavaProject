package com.base.module.javaproject.java.polymorphism;

import java.util.concurrent.ScheduledExecutorService;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午3:13
 * @Description:
 */
public class Sandwich extends ProtableLunch{
    private Bread bread=new Bread();
    private static Cheese cheese=new Cheese();
    private Lettcue lettcue=new Lettcue();

    public Sandwich() {
        System.out.println("Sandwich.Sandwich");
    }

    public static void main(String[] args) {
        Sandwich sandwich=new Sandwich();

    }
}

class Meal {
    public Meal() {
        System.out.println("Meal.Meal");
    }
}

class Bread {
    public Bread() {
        System.out.println("Bread.Bread");
    }
}

class Cheese {
    public Cheese() {
        System.out.println("cheese.cheese");
    }
}
class Lettcue {
    public Lettcue() {
        System.out.println("Lettcue.Lettcue");
    }
}

class Lunch extends Meal {
    public Lunch() {
        System.out.println("Lunch.Lunch");
    }
}

class ProtableLunch extends Lunch {
    public ProtableLunch() {
        System.out.println("Protable.Protable");
    }
}
