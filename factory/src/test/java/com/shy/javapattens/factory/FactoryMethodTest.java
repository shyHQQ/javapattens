package com.shy.javapattens.factory;

import com.shy.javapattens.factorymethod.Car;
import com.shy.javapattens.factorymethod.CarFactoryMethod;
import com.shy.javapattens.factorymethod.CarSimpleFactory;
import org.junit.Test;

/**
 * Created by 29517 on 2016/3/30.
 */
public class FactoryMethodTest {

    @Test
    public void testCarSimpleFactory(){
        Car bigCar = CarSimpleFactory.getCar("big");
        bigCar.size();
        Car smallCar = CarSimpleFactory.getCar("small");
        smallCar.size();
    }

    @Test
    public void testCarFactoryMethod(){
        Car bigCar = CarFactoryMethod.getBigCar();
        bigCar.size();
        Car smallCar = CarFactoryMethod.getSmallCar();
        smallCar.size();
    }
}
