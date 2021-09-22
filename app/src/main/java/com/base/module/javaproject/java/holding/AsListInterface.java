package com.base.module.javaproject.java.holding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: llzhu
 * @CreateDate: 21-9-9 上午11:13
 * @Description:
 */
public class AsListInterface {

    public static void main(String[] args) {
        List<Snow> list= Arrays.asList(new Powder(),new Crusty(),new Slush());

        List<Snow> list1=Arrays.asList(new Light(),new Heavy());

        List<Snow> list2=new ArrayList<>();
        Collections.addAll(list2,new Light(),new Heavy());

        List<Snow> list3=Arrays.<Snow>asList(new Light(),new Heavy());

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
    }}
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}

class Crusty extends Snow{}
class Slush extends Snow{}
