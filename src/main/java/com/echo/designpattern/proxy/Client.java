package com.echo.designpattern.proxy;

public class Client {

	public static void main(String[] args) {
		Sourceable proxy = new Proxy();
		proxy.method();
		proxy.method();
	}

}
