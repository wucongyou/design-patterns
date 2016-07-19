package com.echo.designpattern.mediator;

public interface Mediator {

	public void add(Colleague colleague);

	public void action(Colleague colleague, Action action);
}
