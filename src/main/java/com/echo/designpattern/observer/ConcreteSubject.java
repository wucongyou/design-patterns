package com.echo.designpattern.observer;

public class ConcreteSubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("This is concrete subject change its state and notify all attached observers.");
		notifyObservers();
	}

}
