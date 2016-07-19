package com.echo.designpattern.mediator;

public abstract class AbstractColleague implements Colleague {

	private Mediator mediator;

	@Override
	public void act(Action action) {
		System.out.println(this + " send: " + action.getTitle());
		mediator.action(this, action);
	}

	@Override
	public void interactAction(Action action) {
		System.out.println(this + " response: " + action.getDesc());
	}

	@Override
	public Mediator getMediator() {
		return mediator;
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public abstract String toString();

}
