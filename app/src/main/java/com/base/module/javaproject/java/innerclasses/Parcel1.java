package com.base.module.javaproject.java.innerclasses;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-2 下午2:41
 * @Description:
 */
public class Parcel1 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String lable;

        public Destination(String lable) {
            this.lable = lable;
        }
        String readLable(){
            return lable;
        }
    }
    public void ship(String des){
        Contents contents=new Contents();
        System.out.println("contents.value() = " + contents.value());
        Destination destination=new Destination(des);
        System.out.println("destination.readLable() = " + destination.readLable());
    }

    public static void main(String[] args) {
        Parcel1 parcel1=new Parcel1();
        parcel1.ship("afdggsg");
    }
}
