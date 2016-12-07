package com.dade.collection.java8;

/**
 * Created by Dade on 2016/12/7.
 */
public interface Person {

    default void sayHello() {
        System.out.println("Hello");
    }


}
