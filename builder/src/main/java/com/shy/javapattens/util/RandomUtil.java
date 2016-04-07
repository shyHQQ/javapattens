package com.shy.javapattens.util;

import java.util.Random;

/**
 * Created by 29517 on 2016/4/5.
 */
public class RandomUtil {
    public static int getRandomInt(int n){
        Random random = new Random();
        //获取0-n之间随机数，包含0，不包含n
        return random.nextInt(n);
    }
}
