package com.echo.designpattern.state;

public class Context {

    private IState state;

    public Context(IState state) {
        this.state = state;
    }

    public void doOperate() {
        System.out.println("Before state: " + state.getName());
        state.doChangeState(this);
        System.out.println("After state: " + state.getName());
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

}
