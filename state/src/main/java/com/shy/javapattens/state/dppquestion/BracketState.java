package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.dppquestion.util.RandomUtil;

/**
 * Created by 29517 on 2016/4/11.
 */
public class BracketState extends QuestionState {

    @Override
    public void handle(QuestionContext context) {
        context.getOperateList().add(0);
        context.getNumberList().add(String.valueOf(context.getAnswer()));

        int b = RandomUtil.getRandomInt(4);
        context.setAnswer(Integer.parseInt(context.getNumberList().get(b)));
        context.getNumberList().set(b, "()");
        context.setState(new FinishState());
    }
}
