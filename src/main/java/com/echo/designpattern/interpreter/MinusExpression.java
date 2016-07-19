package com.echo.designpattern.interpreter;

public class MinusExpression implements Expression {

	@Override
	public int interprete(Context context) {
		return context.getOpe1() - context.getOpe2();
	}

}
