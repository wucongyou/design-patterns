package com.wucongyou.designpattern.behavioral.mediator;

public interface IColleague {

    void act(Action action);

    void interactAction(Action action);

    IMediator getMediator();

    void setMediator(IMediator mediator);

}
