package com.wucongyou.designpattern.behavioral.observer;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:40
 */
public interface Subject {

    Subject attach(Observer observer, Observer... os);

    Subject detach(Observer observer);

    void change(State state);

    void notifyObservers(State state);
}
