package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.dppquestion.util.RandomUtil;

/**
 * Created by 29517 on 2016/4/11.
 */
public class FinishState extends QuestionState {
    @Override
    public void handle(QuestionContext context) {
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        for(;i<context.getOperateList().size();i++){
            stringBuilder.append(context.getNumberList().get(i));
            stringBuilder.append(getOperate(context.getOperateList().get(i)));
        }
        stringBuilder.append(context.getNumberList().get(i));
        stringBuilder.append("    answer:");
        stringBuilder.append(context.getAnswer());
        System.out.println(stringBuilder.toString());
    }

    private String getOperate(int o) {
        String operate = "";
        switch (o) {
            case 1:
                operate = "-";
                break;
            case 2:
                operate = "+";
                break;
            case 0:
                operate = "=";
                break;
        }
        return operate;
    }
}
