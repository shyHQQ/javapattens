package com.shy.javapattens.observer;

/**
 * Created by 29517 on 2016/2/27.
 */
public class SmallDog implements Observer {
    private String name;
    private String word;
    private OldDog oldDog;

    public SmallDog(String name, OldDog oldDog) {
        this.name = name;
        this.oldDog = oldDog;
    }

    public void update() {
        word = oldDog.getWord();
        show();
    }

    public void show(){
        System.out.println("小狗("+name+")说:"+word);
    }
}
