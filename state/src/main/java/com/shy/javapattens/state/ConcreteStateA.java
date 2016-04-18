package com.shy.javapattens.state;

/**
 * Created by 29517 on 2016/4/11.
 */
public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("状态A：打开浏览器！");
        context.setState(new ConcreteStateB());
    }
}
