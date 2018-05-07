package com.wucongyou.designpattern.behavioral.memento;

/**
 * Originator in this pattern.
 */
public class Originator implements MementoAware {

    private String name;
    private int value;

    public Originator(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Memento memento() {
        return new Memento(value);
    }

    @Override
    public void recovery(Memento memento) {
        this.value = memento.getValue();
    }

    @Override
    public String toString() {
        return "Originator{" +
            "name='" + name + '\'' +
            ", value=" + value +
            '}';
    }
}
