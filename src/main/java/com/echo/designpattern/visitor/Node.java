package com.echo.designpattern.visitor;

/**
 * Node interface
 */
public interface Node {
	public void accept(Visitor visitor);
}
