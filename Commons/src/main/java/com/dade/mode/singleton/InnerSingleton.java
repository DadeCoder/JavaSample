package com.dade.mode.singleton;

/**
 * Created by Dade on 2016/12/27.
 */
public class InnerSingleton {

    public static class Singleton{
        private static InnerSingleton inner = new InnerSingleton();

    }

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return Singleton.inner;
    }

    public static void main(String[] args) {
        InnerSingleton in1 = InnerSingleton.getInstance();
        InnerSingleton in2 = InnerSingleton.getInstance();
        System.out.println(in1 == in2);
    }

}
