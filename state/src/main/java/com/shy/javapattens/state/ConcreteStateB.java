package com.shy.javapattens.state;

/**
 * Created by 29517 on 2016/4/11.
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("状态B：打开百度。");
//        context.setState(new ConcreteStateB());
    }
}
