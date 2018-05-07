package com.wucongyou.designpattern.behavioral.mediator;

public class Mediator extends AbstractMediator {

    private String name;

    public Mediator(String name) {
        this.name = name;
    }

    @Override
    public void doAction(IColleague colleague, Action action) {
        for (IColleague co : colleagues) {
            if (!co.equals(colleague)) {
                co.interactAction(action);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

}
