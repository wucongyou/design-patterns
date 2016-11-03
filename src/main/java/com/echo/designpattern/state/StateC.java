package com.echo.designpattern.state;

/**
 * Concrete state
 */
public class StateC implements IState {

  private String name = "C";

  @Override
  public void doChangeState(Context context) {
    context.setState(new StateA());
  }

  @Override
  public String getName() {
    return name;
  }

}
