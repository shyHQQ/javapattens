package com.shy.javapattens.builder;

import org.junit.Test;

/**
 * Created by 29517 on 2016/4/7.
 */
public class Client {

    @Test
    public void test() {
        DppQuestionBuilder dppQuestionBuilder = new DppQuestionBuilder();
        ShyDirector shyDirector = new ShyDirector(dppQuestionBuilder);
        for (int i = 0; i < 20; i++) {
            Question question = shyDirector.construct();
            question.print();
        }
    }

}
