package com.base.module.javaproject.java.reuse;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-26 下午12:01
 * @Description:
 */
public class BlankFinal {
    private final int i=1;
    public final int j;//必须在构造器中初始化
    private final Dog dog;//必须在构造器中初始化

    public BlankFinal(int j) {
        this.j = j;
        dog = new Dog(i,j);
    }

    public BlankFinal() {
        j = 2;
//        j=5;//一旦初始化不能被修改
        dog=new Dog(i,j);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(10);
    }
}
class Dog{
    private int age;
    private int weight;

    public Dog(int age, int weight) {
        this.age = age;
        this.weight = weight;
        System.out.println("Dog.Dog");
        System.out.println("age = " + age + ", weight = " + weight);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
