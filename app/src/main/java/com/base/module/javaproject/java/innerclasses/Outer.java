package com.base.module.javaproject.java.innerclasses;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-2 下午3:03
 * @Description:
 */
public class Outer {
    private String time;

    public Outer(String time) {
        this.time = time;
    }

    class Inner{
        private String name="inner";
        public String getName(){
            return name;
        }
        public String getTime(){
            return time;
        }
    }

    public Inner getInner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer=new Outer("周一");

        Inner inner1= outer.new Inner();
        Inner inner2=outer.new Inner();

        Inner inner=outer.getInner();
        System.out.println("inner.getName() = " + inner.getName());
        System.out.println("inner.getTime() = " + inner.getTime());
    }
}
