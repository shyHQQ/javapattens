package com.shy.javapattens.state;

/**
 * Created by 29517 on 2016/4/11.
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
    }
}
