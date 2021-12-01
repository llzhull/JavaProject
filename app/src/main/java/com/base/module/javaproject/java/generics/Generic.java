package com.base.module.javaproject.java.generics;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-22 下午5:19
 * @Description:
 */
public class Generic<T> {

    private T key;

    public Generic(T key) {
        this.key = key;
    }
    public Generic() {
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        Generic<Integer> integerGeneric=new Generic<>(123);
        Generic<Number> numberGeneric=new Generic<>(456);
        Generic generic=new Generic();
        generic.showKeyValue(integerGeneric);
        generic.showKeyValue(numberGeneric);

        generic.showKeyValue1(integerGeneric);
        generic.showKeyValue1(numberGeneric);


    }
    public void showKeyValue(Generic<Number> numberGeneric){
        System.out.println("numberGeneric.getKey() = " + numberGeneric.getKey());
    }
    public void showKeyValue1(Generic<?> numberGeneric){
        System.out.println("numberGeneric.getKey() = " + numberGeneric.getKey());
    }
}
