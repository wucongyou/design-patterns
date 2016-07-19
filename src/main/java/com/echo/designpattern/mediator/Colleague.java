package com.echo.designpattern.mediator;

public interface Colleague {

	public void act(Action action);

	public void interactAction(Action action);

	public void setMediator(Mediator mediator);

	public Mediator getMediator();
}
