package com.shy.javapattens.observer;

/**
 * Created by 29517 on 2016/2/25.
 */
public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public void notice();
}
