package com.shy.javapattens.observer;

import java.util.Vector;

/**
 * Created by 29517 on 2016/2/27.
 */
public class OldDog implements Subject {
    private String word;
    //老狗管理一群小狗
    private Vector smallDogs;

    public OldDog(){
        word = "";
        smallDogs = new Vector();
    }

    public void attach(Observer o) {
        smallDogs.add(o);
    }

    public void detach(Observer o) {
        smallDogs.remove(o);
    }

    public void notice() {
        for(int i=0;i<smallDogs.size();i++){
            ((Observer)smallDogs.get(i)).update();
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
        notice();//通知小狗
    }
}
