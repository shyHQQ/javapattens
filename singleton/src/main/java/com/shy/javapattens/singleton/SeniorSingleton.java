package com.shy.javapattens.singleton;

/**
 * Created by 29517 on 2016/3/21.
 */
public class SeniorSingleton {
    private static SeniorSingleton seniorSingleton;

    private SeniorSingleton(){}

    public static SeniorSingleton getInstance(){
        if(seniorSingleton==null){
            synchronized (SeniorSingleton.class){
                if(seniorSingleton==null){
                    seniorSingleton = new SeniorSingleton();
                }
            }
        }
        return seniorSingleton;
    }
}
