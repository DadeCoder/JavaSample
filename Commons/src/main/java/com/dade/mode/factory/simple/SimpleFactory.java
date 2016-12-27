package com.dade.mode.factory.simple;


/**
 * Created by Dade on 2016/12/27.
 */
public class SimpleFactory {

    public Human createHuman(String type){

        Human human = null;

        if (type.equals("chinese"))
            human = new Chinese();
        else
            human = new English();

        return human;

    }

}
