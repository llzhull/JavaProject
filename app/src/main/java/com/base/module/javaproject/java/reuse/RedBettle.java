package com.base.module.javaproject.java.reuse;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-26 下午2:50
 * @Description:
 */
public class RedBettle extends Bettle{
    private int j=printInit("RedBettle.j init");

    public RedBettle() {
        System.out.println("RedBettle.j = "+j);
    }
    private static int r=printInit("RedBettle.r init");
    public static void main(String[] args) {
        System.out.println("RebBettle constrctor");
        RedBettle redBettle=new RedBettle();
    }
}

class Bettle {
    private int k=printInit("Bettle.k init");

    public Bettle() {
        System.out.println("bettle.k = "+k);
    }
    private static int b=printInit("bettle.b init");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

