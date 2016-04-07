package com.shy.javapattens.builder;

import com.shy.javapattens.util.RandomUtil;

/**
 * Created by 29517 on 2016/3/31.
 */
public class DppQuestionBuilder implements Builder {
    DppQuestion dppQuestion ;

    public DppQuestionBuilder() {
        this.dppQuestion = new DppQuestion();
    }

    @Override
    public void buildNum1() {
        int num = RandomUtil.getRandomInt(21);
        dppQuestion.setNum1(String.valueOf(num));
        dppQuestion.setAnswer(num);
    }

    @Override
    public void buildOperate1() {
        //0表示减号；1表示加号
        int o = RandomUtil.getRandomInt(2);
        if(dppQuestion.getAnswer()==0){
            o = 1;
        }else if(dppQuestion.getAnswer() == 20){
            o = 0;
        }
        dppQuestion.setOperate1(o);
    }

    @Override
    public void buildNum2() {
        int answer = dppQuestion.getAnswer();
        //0表示减号
        if(dppQuestion.getOperate1()==0){
            int num = RandomUtil.getRandomInt(dppQuestion.getAnswer()+1);
            dppQuestion.setNum2(String.valueOf(num));
            answer = answer - num;
        }else{
            int num = RandomUtil.getRandomInt(21 - dppQuestion.getAnswer());
            dppQuestion.setNum2(String.valueOf(num));
            answer = answer + num;
        }
        dppQuestion.setAnswer(answer);
    }

    @Override
    public void buildOperate2() {
        //0表示减号；1表示加号
        int o = RandomUtil.getRandomInt(2);
        if(dppQuestion.getAnswer()==0){
            o = 1;
        }else if(dppQuestion.getAnswer() == 20){
            o = 0;
        }
        dppQuestion.setOperate2(o);
    }

    @Override
    public void buildNum3() {
        int answer = dppQuestion.getAnswer();
        //0表示减号
        if(dppQuestion.getOperate2()==0){
            int num = RandomUtil.getRandomInt(dppQuestion.getAnswer()+1);
            dppQuestion.setNum3(String.valueOf(num));
            answer = answer - num;
        }else{
            int num = RandomUtil.getRandomInt(21 - dppQuestion.getAnswer());
            dppQuestion.setNum3(String.valueOf(num));
            answer = answer + num;
        }
        dppQuestion.setAnswer(answer);
        dppQuestion.setNum4(String.valueOf(answer));
    }

    @Override
    public void buildBrackets() {
        int b = RandomUtil.getRandomInt(4);
        switch (b){
            case 0:
                dppQuestion.setNum1("()");
                break;
            case 1:
                dppQuestion.setNum2("()");
                break;
            case 2:
                dppQuestion.setNum3("()");
                break;
            case 3:
                dppQuestion.setNum4("()");
                break;
        }
    }

    @Override
    public Question getQuestion() {
        return dppQuestion;
    }

}
