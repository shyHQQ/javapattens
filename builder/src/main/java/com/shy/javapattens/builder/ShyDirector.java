package com.shy.javapattens.builder;

/**
 * Created by 29517 on 2016/4/5.
 */
public class ShyDirector {
    private Builder builder;

    public ShyDirector(Builder builder) {
        this.builder = builder;
    }

    public Question construct(){
        builder.buildNum1();
        builder.buildOperate1();
        builder.buildNum2();
        builder.buildOperate2();
        builder.buildNum3();
        builder.buildBrackets();
        return builder.getQuestion();
    }
}
