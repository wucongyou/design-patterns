package com.echo.designpattern.observer;

public class Client {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer o1 = new ConcreteObserverA("Tom");
		Observer o2 = new ConcreteObserverB("Cathelin");
		subject.add(o1);
		subject.add(o2);
		subject.operation();
	}

}
