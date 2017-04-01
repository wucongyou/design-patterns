package com.echo.designpattern.behavioral.observer;

/**
 * @author congyou.wu
 * @since 2017-04-01 下午11:43
 */
public class Client {

    public static void main(String[] args) {
        new ConcreteSubject()
            .attach(new ConcreteObserver("Tom"), new ConcreteObserver("Catherin"))
            .change(new State("tomorrow will be rainy"));
    }
}
