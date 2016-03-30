package com.shy.javapattens.factorymethod;

/**
 * Created by 29517 on 2016/3/30.
 */
public class CarSimpleFactory {
    public static Car getCar(String carSize){
        Car car = null;
        if("big".equals(carSize)){
            car = new BigCar();
        }else if("small".equals(carSize)){
            car = new SmallCar();
        }
        return car;
    }
}
