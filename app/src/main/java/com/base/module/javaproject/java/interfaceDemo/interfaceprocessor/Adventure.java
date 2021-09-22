package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午4:38
 * @Description:
 */
public class Adventure {
    public static void fight(CanFight canFight ){
        canFight.fight();
    }
    public static void swim(CanSwim canSwim){
        canSwim.swim();
    }
    public static void fly(CanFly canFly){
        canFly.fly();
    }
    public static void action(ActionCharacter actionCharacter){
        actionCharacter.fight();
    }
    public static void main(String[] args) {
        Hero hero=new Hero();
        fight(hero);
        swim(hero);
        fly(hero);
        action(hero);

    }
}

interface CanFight {
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}

class ActionCharacter {
    public void fight() {

    }
}

class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}