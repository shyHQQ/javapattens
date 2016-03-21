package com.shy.javapattens.singleton;

/**
 * Created by 29517 on 2016/3/21.
 */
public class SimpleSingleton {
    private static SimpleSingleton simpleSingleton;

    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        if(simpleSingleton==null){
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
