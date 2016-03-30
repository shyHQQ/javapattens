package com.shy.javapattens.factorymethod;

/**
 * Created by 29517 on 2016/3/30.
 */
public class CarFactoryMethod {

    public static Car getBigCar(){
        return new BigCar();
    }

    public static Car getSmallCar(){
        return new SmallCar();
    }
}
