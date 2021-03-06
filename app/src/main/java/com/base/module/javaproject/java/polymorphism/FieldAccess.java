package com.base.module.javaproject.java.polymorphism;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-27 下午2:02
 * @Description: 域不具有多态性
 */
public class FieldAccess {
    public static void main(String[] args) {

        //向上转型，Super.field 和 Sub.field 分配了不同的存储空间，sup.field = 父类的域
        Super sup=new Sub();
        System.out.println("sup.field = " + sup.field);
        System.out.println("sup.getField() = " + sup.getField());
        Sub sub=new Sub();
        System.out.println("sub.field = " + sub.field);
        System.out.println("sub.getField() = " + sub.getField());



    }
}

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}
class Sub extends Super{
    public int field=1;

    @Override
    public int getField() {
        return field;
    }
    public int getSuperField(){
        return super.field;
    }
}