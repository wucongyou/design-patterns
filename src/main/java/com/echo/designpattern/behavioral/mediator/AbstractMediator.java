package com.echo.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMediator implements IMediator {

    protected List<IColleague> colleagues = new ArrayList<IColleague>();

    @Override
    public void attach(IColleague colleague) {
        System.out.println(colleague + " attached to mediator: " + this + ".");
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public abstract void doAction(IColleague colleague, Action action);

}
