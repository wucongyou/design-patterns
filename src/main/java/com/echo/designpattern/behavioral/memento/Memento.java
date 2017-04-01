package com.echo.designpattern.behavioral.memento;

/**
 * Memento in this pattern,keeps the attributes of Originator which need to be
 * kept.
 */
public class Memento {

    private int value;

    public Memento(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
