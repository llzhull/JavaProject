package com.base.module.javaproject.java.innerclasses;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-3 下午3:58
 * @Description:
 */
public class Parcel8 {
    class MyContants implements IContents{
        private int i=8;
        @Override
        public int value() {
            return i;
        }
    }
public IContents contents(){
        return new MyContants();
}
    public static void main(String[] args) {
        Parcel8 parcel8=new Parcel8();
        IContents contents = parcel8.contents();

    }
}
