package com.echo.designpattern.singleton;

public class RegSingletonChild extends RegSingleton {
	public RegSingletonChild() {
	}

	/**
	 * 静态工厂方法
	 */
	static public RegSingletonChild getInstance() {
		return (RegSingletonChild) RegSingleton.getInstance("com.echo.designpattern.singleton.RegSingletonChild");
	}

	/**
	 * 一个示意性的商业方法
	 */
	public String about() {
		return "Hello， I am RegSingletonChild.";
	}
}
