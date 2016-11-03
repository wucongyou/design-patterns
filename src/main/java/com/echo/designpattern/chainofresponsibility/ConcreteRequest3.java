package com.echo.designpattern.chainofresponsibility;

public class ConcreteRequest3 extends Request {
	private int level = RequestLevel.LEVEL_3;

	public ConcreteRequest3(String content) {
		super(content);
	}

	@Override
	protected int getRequestLevel() {
		return level;
	}

}
