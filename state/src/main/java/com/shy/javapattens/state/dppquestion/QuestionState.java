package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.Context;

/**
 * Created by 29517 on 2016/4/11.
 */
public abstract class QuestionState {
    public abstract void handle(QuestionContext context);
}
