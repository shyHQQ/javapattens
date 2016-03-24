package com.shy.javapattens.strategy;

/**
 * Created by 29517 on 2016/3/24.
 */
public class Person {
    private String name;
    private HowToGo howToGo;

    public Person(String name, HowToGo howToGo){
        this.name = name;
        this.howToGo = howToGo;
    }

    public void gotoRome(){
        System.out.print(name);
        howToGo.reachRome();
    }
}
