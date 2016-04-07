package com.shy.javapattens.builder;

import java.util.List;

/**
 * Created by 29517 on 2016/3/31.
 */
public class DppQuestion implements Question {
    private String num1;
    private String num2;
    private String num3;
    private String num4;
    private int answer;

    private int operate1;
    private int operate2;

    @Override
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num1);
        stringBuilder.append(getOperate(operate1));
        stringBuilder.append(num2);
        stringBuilder.append(getOperate(operate2));
        stringBuilder.append(num3);
        stringBuilder.append("=");
        stringBuilder.append(num4);
        System.out.println(stringBuilder.toString());
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getNum3() {
        return num3;
    }

    public void setNum3(String num3) {
        this.num3 = num3;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getNum4() {
        return num4;
    }

    public void setNum4(String num4) {
        this.num4 = num4;
    }

    public int getOperate1() {
        return operate1;
    }

    public void setOperate1(int operate1) {
        this.operate1 = operate1;
    }

    public int getOperate2() {
        return operate2;
    }

    public void setOperate2(int operate2) {
        this.operate2 = operate2;
    }

    private String getOperate(int o) {
        String operate = "";
        switch (o) {
            case 0:
                operate = "-";
                break;
            case 1:
                operate = "+";
                break;
        }
        return operate;
    }
}
