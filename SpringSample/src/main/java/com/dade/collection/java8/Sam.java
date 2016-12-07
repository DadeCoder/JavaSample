package com.dade.collection.java8;

/**
 * Created by Dade on 2016/12/7.
 */
public class Sam implements Person,Male {


    public void sayHello() {
        Male.super.sayHello();
    }
}
