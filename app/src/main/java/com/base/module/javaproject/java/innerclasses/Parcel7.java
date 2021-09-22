package com.base.module.javaproject.java.innerclasses;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-3 下午3:56
 * @Description:
 */
public class Parcel7 {
    public IContents contents(){
        return new IContents() {
            int value=1;
            @Override
            public int value() {
                return value;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7=new Parcel7();
        IContents contents=parcel7.contents();
        System.out.println("contents.value() = " + contents.value());
    }
}
