package com.echo.designpattern.command;

public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		ICommand command = new Command(receiver);
		Invoker invoker = new Invoker(command);
		invoker.runCommand();
	}
}
