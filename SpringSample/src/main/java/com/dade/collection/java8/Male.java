package com.dade.collection.java8;

/**
 * Created by Dade on 2016/12/7.
 */
public interface Male {
    default void sayBye() {
        System.out.println("Bye");
    }

    default void sayHello() {
        System.out.println("Hi");
    }

}
