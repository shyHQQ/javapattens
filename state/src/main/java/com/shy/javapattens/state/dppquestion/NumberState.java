package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.dppquestion.util.RandomUtil;

/**
 * Created by 29517 on 2016/4/11.
 */
public class NumberState extends QuestionState {

    @Override
    public void handle(QuestionContext context) {
        int range = context.getRange();
        int answer = context.getAnswer();
        int index = context.getNumberList().size();
        if(index == 0){
            int num = RandomUtil.getRandomInt(range + 1);
            context.getNumberList().add(String.valueOf(num));
            answer = num;
        }else{
            //1表示减号
            if(context.getOperateList().get(index-1) == 1){
                int num = RandomUtil.getRandomInt(answer+1);
                context.getNumberList().add(String.valueOf(num));
                answer = answer - num;
            }else{
                int num = RandomUtil.getRandomInt(range + 1 - answer);
                context.getNumberList().add(String.valueOf(num));
                answer = answer + num;
            }
        }
        context.setAnswer(answer);
//        context.setState(new OperateState());
    }
}
