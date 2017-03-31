package com.echo.designpattern.behavioral.memento;

/**
 * @author echo
 * @since 16-11-3
 */
public interface IMementoAware {

    Memento getMemento();

    void recovery(Memento memento);

}
