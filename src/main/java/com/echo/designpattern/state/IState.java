package com.echo.designpattern.state;

/**
 * State interface
 */
public interface IState {

    void doChangeState(Context context);

    String getName();

}
