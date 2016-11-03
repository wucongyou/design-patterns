package com.echo.designpattern.mediator;

public interface IColleague {

  void act(Action action);

  void interactAction(Action action);

  void setMediator(IMediator mediator);

  IMediator getMediator();

}
