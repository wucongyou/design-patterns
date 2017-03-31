package com.echo.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Originator in this pattern
 */
@Data
@AllArgsConstructor
public class Originator implements IMementoAware {

    private String name;
    private int value;

    @Override
    public Memento getMemento() {
        return new Memento(value);
    }

    @Override
    public void recovery(Memento memento) {
        this.value = memento.getValue();
    }

}
