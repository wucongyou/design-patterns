package com.echo.designpattern.observer;

public class ConcreteObserverB implements Observer {
	String name;

	public ConcreteObserverB(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Concrete observer type B : " + getName() + " has got notification and did something.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
