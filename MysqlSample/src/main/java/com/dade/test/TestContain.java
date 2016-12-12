package com.dade.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dade on 2016/12/12.
 */
public class TestContain {

    public static void main(String[] args) {

//        Map<String,String> map  = new HashMap<>();
//        String res = map.putIfAbsent("name","dade");
//        System.out.println(res);
//        map.forEach((k,v)-> System.out.println("k: " + k + " v: " + v));


        Map<String, String> map = new HashMap<>();
        String res1 =  map.putIfAbsent("name","dade");
        String res2 =  map.putIfAbsent("name","Dade");
        System.out.println("res1: " + res1);
        System.out.println("res2: " + res2);
        map.forEach((k,v)-> System.out.println("k: " + k + " v: " + v));


    }

}
