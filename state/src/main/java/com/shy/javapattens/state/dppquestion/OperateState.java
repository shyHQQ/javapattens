package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.dppquestion.util.RandomUtil;

/**
 * Created by 29517 on 2016/4/11.
 */
public class OperateState extends QuestionState {

    @Override
    public void handle(QuestionContext context) {
        int range = context.getRange();
        //1表示减号；2表示加号
        int o = RandomUtil.getRandomInt(2) + 1;
        if(context.getAnswer()==0){
            o = 2;
        }else if(context.getAnswer() == range){
            o = 1;
        }
        context.getOperateList().add(o);
//        context.setState(new NumberState());
    }
}
