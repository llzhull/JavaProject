package com.base.module.javaproject.java.polymorphism;

import androidx.annotation.NonNull;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午3:57
 * @Description: 协变返回类型
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println("grain = " + grain);

        mill=new WheatMill();
        grain=mill.process();
        System.out.println("grain = " + grain);

    }
}

class Grain {
    @NonNull
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @NonNull
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    Wheat process() {
        return new Wheat();
    }
}

