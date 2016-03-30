package com.shy.javapattens.abstractfactory;

/**
 * Created by 29517 on 2016/3/30.
 */
public class LiNingShoeFactory implements ShoeFactory {
    @Override
    public Shoe produce() {
        return new LiNingShoe();
    }
}
