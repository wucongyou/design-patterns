package com.echo.designpattern.behavioral.mediator;

public abstract class AbstractColleague implements IColleague {

    private IMediator mediator;

    @Override
    public void act(Action action) {
        System.out.println(this + " send: " + action.getTitle());
        mediator.doAction(this, action);
    }

    @Override
    public void interactAction(Action action) {
        System.out.println(this + " response: " + action.getDesc());
    }

    @Override
    public IMediator getMediator() {
        return mediator;
    }

    @Override
    public void setMediator(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public abstract String toString();

}
