package com.echo.designpattern.behavioral.observer;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:42
 */
public abstract class AbstractSubject implements Subject {

    protected State state;
    protected String name;

    @Override
    public abstract Subject attach(Observer observer, Observer... os);

    @Override
    public abstract Subject detach(Observer observer);

    @Override
    public abstract void notifyObservers(State state);

    @Override
    public abstract void change(State state);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
