package com.shy.javapattens.observer;

import org.junit.Test;

/**
 * Created by 29517 on 2016/3/22.
 */
public class Client {

    @Test
    public void test() {
        //定义目标者与观察者
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
