package com.base.module.javaproject.java.interfaceDemo.Nesting;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-1 下午4:27
 * @Description:
 */
public class NestingInterface {
    public static void main(String[] args) {
        A a=new A();
        //todo 没有权限
//        A.D d = a.getD();
//        A.DImp2 dImp2= a.getD();
//        a.getD().f();

        A a1=new A();
        a1.receivedD(a.getD());
    }
    public class BImp implements A.B {
        @Override
        public void f() {

        }
    }

    class CImp implements A.C {
        @Override
        public void f() {

        }
    }
    //todo 不能实现 A 中的私有接口，除了A 中的子类
//    class DImp implements A.D{
//
//        @Override
//        public void f() {
//
//        }
//    }

    class EImp implements E {
        @Override
        public void g() {

        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {

        }
    }

    class EImp2 implements E {
        @Override
        public void g() {

        }
        class EG implements E.G{
            @Override
            public void f() {

            }
        }
    }
}

class A {
    //todo 默认 interface
    interface B {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {

        }
    }

    private class BImp2 implements B {
        @Override
        public void f() {

        }
    }


    //todo public interface
    public interface C {
        void f();
    }

    class CImp implements C {
        @Override
        public void f() {

        }
    }

    private class CImp2 implements C {
        @Override
        public void f() {

        }
    }

    //todo private interface
    private interface D {
        void f();
    }

    private class DImp implements D {
        @Override
        public void f() {

        }
    }

    public class DImp2 implements D {
        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receivedD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    //todo default interface
    interface G {
        void f();
    }

    //todo public interface，public是多余的
    public interface H {
        void f();
    }

    //todo 接口中不能定义 private
//    private interface I{
//        void f();
//    }
    void g();
}


