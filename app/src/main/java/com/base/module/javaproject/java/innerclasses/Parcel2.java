package com.base.module.javaproject.java.innerclasses;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-2 下午2:51
 * @Description:
 */
public class Parcel2 {
    class Content2{
        private int i=1;
        public int getValue(){
            return i;
        }
    }
    class Destination{
        private String lable;

        public Destination(String lable) {
            this.lable = lable;
        }
        public String readLable(){
            return lable;
        }
    }

    private static class InnerStatic{

    }

    public Destination to(String s){
        return new Destination(s);
    }
    public Content2 content(){
        return new Content2();
    }
    public void ship(String s){
        Content2 content2=content();
        Destination destination=to(s);
        System.out.println("destination.readLable() = " + destination.readLable());
    }

    public static void main(String[] args) {
        Parcel2 parcel2=new Parcel2();
        parcel2.ship("dterggt");

        Parcel2.Destination d1=parcel2.new Destination("1111");


        Parcel2 q=new Parcel2();
        Parcel2.Destination destination=q.to("ccccc");
        Parcel2.Content2 content2=q.content();
        System.out.println("destination.readLable() = " + destination.readLable());

        //初始化静态内部类，可以不需要外部类对象
        InnerStatic innerStatic=new InnerStatic();

        //初始化非静态内部类，必须使用外部类的对象来创建内部类
        Parcel2 parcel21=new Parcel2();
//        Content2 content21=new Content2();
        Content2 content21=parcel21.new Content2();

    }
}
