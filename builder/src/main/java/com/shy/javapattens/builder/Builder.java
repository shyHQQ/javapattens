package com.shy.javapattens.builder;

/**
 * Created by 29517 on 2016/3/31.
 */
public interface Builder {
    void buildNum1();
    void buildOperate1();
    void buildNum2();
    void buildOperate2();
    void buildNum3();

    void buildBrackets();

    Question getQuestion();
}
