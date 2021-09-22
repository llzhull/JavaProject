package com.base.module.javaproject.java.polymorphism;

import androidx.annotation.NonNull;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-26 下午3:17
 * @Description:
 */
public class CycleDemo {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        ride(cycle);

        UniCycle uniCycle = new UniCycle();
        ride(uniCycle);

        BiCycle biCycle = new BiCycle();
        ride(biCycle);

        TriCycle triCycle = new TriCycle();
        ride(triCycle);

    }

    static void ride(Cycle cycle) {
        System.out.println("CycleDemo.ride cycle = " + cycle.toString());
        cycle.speed();
    }
}

class Cycle {
    public Cycle() {
//        System.out.println("Cycle.Cycle");
    }

    void speed() {
        System.out.println("Cycle.speed");
    }

    @NonNull
    @Override
    public String toString() {
        return "Cycle";
    }
}

class UniCycle extends Cycle {
    public UniCycle() {
//        System.out.println("UniCycle.UniCycle");
    }

    @Override
    void speed() {
        super.speed();
        System.out.println("UniCycle.speed");
    }

    @NonNull
    @Override
    public String toString() {
        return "UniCycle";
    }
}

class BiCycle extends Cycle {
    public BiCycle() {
//        System.out.println("BiCycle.BiCycle");
    }

    @Override
    void speed() {
        super.speed();
        System.out.println("BiCycle.speed");
    }

    @NonNull
    @Override
    public String toString() {
        return "BiCycle";
    }
}

class TriCycle extends Cycle {
    public TriCycle() {
//        System.out.println("TriCycle.TriCycle");
    }

    @Override
    void speed() {
        super.speed();
        System.out.println("TriCycle.speed");
    }

    @NonNull
    @Override
    public String toString() {
        return "TriCycle";
    }
}