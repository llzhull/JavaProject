package com.base.module.javaproject.java.reuse;

import androidx.annotation.Nullable;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-26 下午2:19
 * @Description:
 */
public class FinalOverride {
    public static void main(String[] args) {

    }
}

class Animal {
    final void eat() {
        System.out.println("Animal.eat");
    }

    private void age() {
        System.out.println("Animal.age");
    }

    void weight() {
        System.out.println("Animal.weight");
    }
}

class Sheep extends Animal {
    //    @Override
    // final 方法不能被重写
//    final void eat(){
//        System.out.println("Animal.eat");
//    }

    //父类的age（） 方法是 private，这里只是 方法名字一样，不是重写
    private void age() {
        System.out.println("Sheep.age");
    }


//    @Override
//    private void weight() {
//        super.weight();
//    }
}
