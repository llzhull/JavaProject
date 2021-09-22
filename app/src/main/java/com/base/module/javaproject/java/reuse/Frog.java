package com.base.module.javaproject.java.reuse;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-25 下午3:46
 * @Description:复用
 */
class Amphibian {
    protected void eat() {
        System.out.println("Amphibian.eat");
    }

    protected static void sleep(Amphibian amphibian) {
        System.out.println("Amphibian.sleep");
        amphibian.eat();
    }
}

public class Frog extends Amphibian {
    public static void main(String[] args) {
        Frog frog = new Frog();
        //向上转型
        Amphibian.sleep(frog);

    }

    @Override
    protected void eat() {
//        super.eat();
        System.out.println("Frog.eat");
    }
}


