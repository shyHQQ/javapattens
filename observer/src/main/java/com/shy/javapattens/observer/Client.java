package com.shy.javapattens.observer;

import java.util.Vector;

/**
 * Created by 29517 on 2016/2/25.
 */
public class Client {
    //定义目标者与观察者
    public static void main(String[] args) {
        OldDog oldDog = new OldDog();

        for (int i = 0; i < 10; i++) {
            SmallDog smallDog = new SmallDog("smallDog" + i, oldDog);
            oldDog.attach(smallDog);
        }

        System.out.println("老狗课堂开课啦！");
        System.out.println("老狗说：你好！");
        oldDog.setWord("你好！");

        System.out.println("老狗说：你吃饭了吗？");
        oldDog.setWord("你吃饭了吗？");
    }
}
