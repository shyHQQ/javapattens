package com.shy.javapattens.factorymethod;

/**
 * Created by 29517 on 2016/3/30.
 */
public class SmallCar implements Car {
    @Override
    public void size() {
        System.out.println("我是小车！");
    }
}
