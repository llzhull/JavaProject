package com.base.module.javaproject.java.interfaceDemo.interfaceprocessor;

/**
 * @Author: llzhu
 * @CreateDate: 21-8-31 下午4:53
 * @Description:
 */
public class HorrorShow {
    static void mon(Monster monster){
        monster.menace();
    }
    static void dangerMon(DangerMonster dangerMonster){
        dangerMonster.menace();
        dangerMonster.destory();
    }
    static void lethal(Lethal lethal){
        lethal.kill();
    }

    public static void main(String[] args) {
        DangerMonster dangerMonster=new Dragon();
        mon(dangerMonster);
        dangerMon(dangerMonster);

        BadVampire badVampire=new BadVampire();
        mon(badVampire);
        dangerMon(badVampire);
        lethal(badVampire);
    }
}

interface Monster {
    void menace();
}

interface DangerMonster extends Monster {
    void destory();
}

interface Lethal {
    void kill();
}

class Dragon implements DangerMonster {

    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }
}

interface Vampire extends DangerMonster,Lethal{
    void drinkBlood();
}

class BadVampire implements Vampire {
    @Override
    public void menace() {

    }

    @Override
    public void destory() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}
