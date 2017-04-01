package com.echo.designpattern.behavioral.observer;

import java.util.Arrays;
import java.util.Queue;

import com.google.common.collect.Lists;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:42
 */
public class ConcreteSubject extends AbstractSubject {

    private Queue<Observer> queue = Lists.newLinkedList();

    public ConcreteSubject() {
        name = "weather";
    }

    @Override
    public Subject attach(Observer observer, Observer... os) {
        queue.add(observer);
        queue.addAll(Arrays.asList(os));
        return this;
    }

    @Override
    public Subject detach(Observer observer) {
        queue.remove(observer);
        return this;
    }

    @Override
    public void notifyObservers(State state) {
        System.out.println(name + " notify observers of " + state);
        for (Observer observer : queue) {
            observer.update(state);
        }
    }

    @Override
    public void change(State state) {
        this.state = state;
        notifyObservers(state);
    }
}
