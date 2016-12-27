package com.dade.mode.singleton;

/**
 * Created by Dade on 2016/12/27.
 */
public class SyncSingleton {

    private static SyncSingleton singleton = null;

    private SyncSingleton(){}

    public static SyncSingleton getSingleton(){

        if (singleton == null){
            synchronized (SyncSingleton.class){
                singleton = new SyncSingleton();
            }
        }

        return singleton;

    }

    public static void main(String[] args) {
        SyncSingleton s1 = SyncSingleton.getSingleton();
        SyncSingleton s2 = SyncSingleton.getSingleton();
        System.out.println(s1==s2);
    }

}
