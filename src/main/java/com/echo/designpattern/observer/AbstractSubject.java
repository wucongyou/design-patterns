package com.echo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements Subject {
	List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void operation() {
		notifyObservers();
	}

}
