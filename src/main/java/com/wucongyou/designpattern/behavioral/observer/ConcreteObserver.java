package com.wucongyou.designpattern.behavioral.observer;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:41
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(State state) {
        System.out.println(name + " has been notified of " + state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
