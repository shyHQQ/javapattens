package com.shy.javapattens.singleton;

/**
 * Created by 29517 on 2016/3/21.
 */
public class OtherSingleton {
    private OtherSingleton(){};

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static final OtherSingleton otherSingleton = new OtherSingleton();
    }

    public static final OtherSingleton getInstance(){
        return SingletonFactory.otherSingleton;
    }
}
