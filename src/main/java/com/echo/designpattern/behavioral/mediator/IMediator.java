package com.echo.designpattern.behavioral.mediator;

public interface IMediator {

    void attach(IColleague colleague);

    void doAction(IColleague colleague, Action action);

}
