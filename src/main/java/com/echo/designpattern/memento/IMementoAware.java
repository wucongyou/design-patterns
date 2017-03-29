package com.echo.designpattern.memento;

/**
 * @author echo
 * @since 16-11-3
 */
public interface IMementoAware {

    Memento getMemento();

    void recovery(Memento memento);

}
