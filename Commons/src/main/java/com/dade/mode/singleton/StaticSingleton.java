package com.dade.mode.singleton;

/**
 * Created by Dade on 2016/12/27.
 */
public class StaticSingleton {

    private static StaticSingleton singleton = null;

    static {
        singleton = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static StaticSingleton getSingleton(){
        return singleton;
    }

}
