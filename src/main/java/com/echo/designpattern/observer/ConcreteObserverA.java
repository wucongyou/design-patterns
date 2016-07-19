package com.echo.designpattern.observer;

public class ConcreteObserverA implements Observer {
	String name;

	public ConcreteObserverA(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Concrete observer type A : "+getName() + " has got notification.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
