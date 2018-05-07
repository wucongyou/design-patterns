package com.wucongyou.designpattern.behavioral.memento;

public class Client {

    public static void main(String[] args) {
        Originator origin = new Originator("Tom", 50);
        Caretaker ct = new Caretaker(origin.memento());
        System.out.println("before " + origin);
        origin.setValue(20);
        System.out.println("after " + origin);
        origin.recovery(ct.memento());
        System.out.println("recovery " + origin);
    }
}
