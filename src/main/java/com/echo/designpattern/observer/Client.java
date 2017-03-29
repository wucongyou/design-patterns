package com.echo.designpattern.observer;

public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject();
        IObserver o1 = new ObserverA("Tom");
        IObserver o2 = new ObserverB("Catherin");
        subject.attach(o1);
        subject.attach(o2);
        subject.doChage("say hi");
    }

}
