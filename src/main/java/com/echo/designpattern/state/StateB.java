package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class StateB implements IState {

    private String name = "B";

    @Override
    public void doChangeState(Context context) {
        context.setState(new StateC());
    }

    @Override
    public String getName() {
        return name;
    }

}
