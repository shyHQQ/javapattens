package com.shy.javapattens.strategy;

import org.junit.Test;

/**
 * Created by 29517 on 2016/3/24.
 */
public class StrategyTest {

    @Test
    public void test(){
        ByPlane byPlane = new ByPlane();
        ByShip byShip = new ByShip();

        Person dpp = new Person("dpp", byShip);

        Person lw = new Person("lw", byPlane);

        Person lfzq = new Person("lfzq", new HowToGo() {
            @Override
            public void reachRome() {
                System.out.println("走路到达了罗马！");
            }
        });

        dpp.gotoRome();
        lw.gotoRome();
        lfzq.gotoRome();
    }
}
