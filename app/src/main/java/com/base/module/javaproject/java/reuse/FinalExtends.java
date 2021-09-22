package com.base.module.javaproject.java.reuse;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-26 下午2:30
 * @Description:
 */
public class FinalExtends {
    public static void main(String[] args) {

        Student student=new Student();
        student.age=5;
        student.name="bbbb";
        System.out.println(student.toString());

    }
}

final class Student{
    String name="aaa";
    int age=10;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//final class 不能别继承
//class Teacher extends Student{
//
//}

