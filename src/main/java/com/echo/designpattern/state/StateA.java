package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class StateA implements IState {

  private String name = "A";

  @Override
  public void doChangeState(Context context) {
    context.setState(new StateB());
  }

  @Override
  public String getName() {
    return name;
  }

}
