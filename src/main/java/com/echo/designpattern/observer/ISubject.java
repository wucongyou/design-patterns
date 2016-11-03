package com.echo.designpattern.observer;

public interface ISubject {

  void attach(IObserver observer);

  void detach(IObserver observer);

  void notifyObservers(String state);

}
