package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午5:29
 * @Description: 尽量避免不同的接口使用相同的方法名
 */
public class IInterfaceCollision {
}

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}
class C2 implements I1,I2{
    @Override
    public void f() {

    }

    @Override
    public int f(int i) {
        return 0;
    }
}

class C3 extends C implements I2{

    @Override
    public int f(int i) {
        return 0;
    }

}
class C4 extends C implements I3{
    //接口和父类的方法名相同，参数类型相同，返回值相同，没有问题
    public int f() {
        return 1;
    }
}

//class C5 extends C implements I1{
//    @Override
//    public int f() {
//        return super.f();
//    }
//
//}
//class C6 extends C implements I1,I3{
//    @Override
//    public int f() {
//        return super.f();
//    }
//}