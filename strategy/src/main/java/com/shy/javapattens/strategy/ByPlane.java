package com.shy.javapattens.strategy;

/**
 * Created by 29517 on 2016/3/24.
 */
public class ByPlane implements HowToGo {

    @Override
    public void reachRome() {
        System.out.println("乘飞机到达了罗马！");
    }
}
