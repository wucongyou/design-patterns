package com.wucongyou.designpattern.behavioral.memento;

/**
 * Caretaker in this pattern, holds a memento created by a originator.
 */
public class Caretaker {

    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento memento() {
        return memento;
    }
}
