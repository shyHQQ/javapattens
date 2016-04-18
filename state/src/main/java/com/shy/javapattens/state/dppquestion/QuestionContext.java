package com.shy.javapattens.state.dppquestion;

import com.shy.javapattens.state.State;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29517 on 2016/4/18.
 */
public class QuestionContext {
    private List<String> numberList;
    private List<Integer> operateList;
    private int answer;
    private int range;

    private QuestionState state;

    public QuestionContext(QuestionState state, int range) {
        this.state = state;
        this.range =range;
        this.numberList = new ArrayList<String>();
        this.operateList = new ArrayList<Integer>();
        this.answer = 0;
    }

    public List<String> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<String> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getOperateList() {
        return operateList;
    }

    public void setOperateList(List<Integer> operateList) {
        this.operateList = operateList;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public QuestionState getState() {
        return state;
    }

    public void setState(QuestionState state) {
        this.state = state;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void request(){
        state.handle(this);
    }
}
