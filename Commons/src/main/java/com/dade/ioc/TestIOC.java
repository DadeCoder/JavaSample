package com.dade.ioc;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dade on 2016/12/27.
 */
public class TestIOC {


//    static{
//        System.out.println("static!");
//    }

//    public static void main(String[] args) {
////        System.out.println("main!");
//        SuperClass superClass = new BasicClass();
//        superClass.say();
//    }

    public static void main(String... args) {
        System.out.println("test!");

        List<String> list = new ArrayList<>();
        list.add("dade");
        list.stream().forEach( v -> System.out.println(v));

    }


}
