package com.echo.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject implements ISubject {

    List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String state) {
        System.out.println("Subject state: " + state);
        for (IObserver observer : observers) {
            observer.update(state);
        }
    }

}
