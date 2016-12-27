package com.dade.mode.factory.simple;

/**
 * Created by Dade on 2016/12/27.
 */
public class TestFactory {

    public static void main(String[] args) {

        SimpleFactory simpleFactory = new SimpleFactory();

        Human chinese = simpleFactory.createHuman("chinese");
        Human english = simpleFactory.createHuman("english");

        chinese.say();
        english.say();

    }

}
