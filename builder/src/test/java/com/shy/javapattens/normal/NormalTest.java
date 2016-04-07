package com.shy.javapattens.normal;

import com.shy.javapattens.util.RandomUtil;
import org.junit.Test;

/**
 * Created by 29517 on 2016/4/5.
 */
public class NormalTest {

    @Test
    public void test(){
        for(int i=0; i<20; i++){
            System.out.println(createQuestion());
        }
    }

    private static String createQuestion() {
        int[] operates = new int[2];
        int[] nums = new int[4];
        int currentResult = 0;//当前值

        nums[0] = RandomUtil.getRandomInt(21);
        currentResult = nums[0];
        //第一个符号
        operates[0] = RandomUtil.getRandomInt(2);
        //第二个符号
        operates[1] = RandomUtil.getRandomInt(2);

        if (currentResult == 0) {
            operates[0] = 1;
        }else if(currentResult == 20){
            operates[0] = 0;
        }

        if (operates[0] == 0) {
            //是减号
            nums[1] = RandomUtil.getRandomInt(currentResult + 1);
            currentResult = currentResult - nums[1];
        } else {
            //是加号
            nums[1] = RandomUtil.getRandomInt(21 - currentResult);
            currentResult = currentResult + nums[1];
        }

        if (currentResult == 0) {
            operates[1] = 1;
        }else if(currentResult == 20){
            operates[1] = 0;
        }

        if (operates[1] == 0) {
            //是减号
            nums[2] = RandomUtil.getRandomInt(currentResult + 1);
            currentResult = currentResult - nums[2];
        } else {
            //是加号
            nums[2] = RandomUtil.getRandomInt(21 - currentResult);
            currentResult = currentResult + nums[2];
        }

        nums[3] = currentResult;
        String[] numString = new String[4];
        for(int i=0;i<nums.length;i++) {
            numString[i] = String.valueOf(nums[i]);
        }
        int bracket = RandomUtil.getRandomInt(4);
        numString[bracket] = "()";

        return print(numString,operates);
    }

    private static String print(String[] nums, int[]  operates){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nums[0]);
        stringBuilder.append(getOperate(operates[0]));
        stringBuilder.append(nums[1]);
        stringBuilder.append(getOperate(operates[1]));
        stringBuilder.append(nums[2]);
        stringBuilder.append("=");
        stringBuilder.append(nums[3]);
        return stringBuilder.toString();
    }

    private static String getOperate(int o){
        String operate = "";
        switch (o){
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
