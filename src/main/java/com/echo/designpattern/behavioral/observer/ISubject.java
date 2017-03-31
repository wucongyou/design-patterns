package com.echo.designpattern.behavioral.observer;

public interface ISubject {

    void attach(IObserver observer);

    void detach(IObserver observer);

    void notifyObservers(String state);

}
