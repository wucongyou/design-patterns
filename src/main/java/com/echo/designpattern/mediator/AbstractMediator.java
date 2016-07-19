package com.echo.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMediator implements Mediator {

	protected List<Colleague> colleagues = new ArrayList<Colleague>();

	@Override
	public void add(Colleague colleague) {
		System.out.println(colleague + " atteched to mediator: " + this + ".");
		colleagues.add(colleague);
		colleague.setMediator(this);
	}

	@Override
	public abstract void action(Colleague colleague, Action action);

}
