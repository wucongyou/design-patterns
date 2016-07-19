package com.echo.designpattern.proxy;

public class Proxy implements Sourceable {
	/* 和装饰者模式的区别是这里的被代理对象是在编译时期确定 ，而装饰者模式在运行期动态指定 */
	Sourceable source = new Proxyee();
	private int invokeCount = 0;

	@Override
	public void method() {
		++invokeCount;
		System.out.println("This is the action added by Proxy." + "");
		source.method();
		System.out.println("Totally invoke " + invokeCount + " times.");
	}

}
