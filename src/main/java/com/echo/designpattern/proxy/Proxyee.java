package com.echo.designpattern.proxy;

public class Proxyee implements Sourceable{

	@Override
	public void method() {
System.out.println("This is the origin doSomething of proxyee");
	}

}
