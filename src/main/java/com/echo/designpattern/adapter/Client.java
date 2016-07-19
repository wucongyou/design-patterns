package com.echo.designpattern.adapter;

public class Client {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method2Adapted();
	}

}
