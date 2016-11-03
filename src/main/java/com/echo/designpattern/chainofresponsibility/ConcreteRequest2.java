package com.echo.designpattern.chainofresponsibility;

public class ConcreteRequest2 extends Request {
	private int level = RequestLevel.LEVEL_2;

	public ConcreteRequest2(String content) {
		super(content);
	}

	@Override
	protected int getRequestLevel() {
		return level;
	}

}
