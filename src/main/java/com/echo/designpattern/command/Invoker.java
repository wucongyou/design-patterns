package com.echo.designpattern.command;

public class Invoker {
	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void runCommand() {
		System.out.println("Invoker calls Command's execute.");
		command.execute();
	}
}
