package com.base.module.javaproject.java.reference;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-1 下午2:06
 * @Description:
 */
public class Apple {
    private String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize() name = " + name);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
