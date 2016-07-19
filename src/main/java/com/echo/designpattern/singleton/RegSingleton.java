package com.echo.designpattern.singleton;

import java.util.HashMap;

/*
 * 登记式单例类是GoF 为了克服饿汉式单例类及懒汉式单例类均不可继承的缺点而设计的
 * */
public class RegSingleton {
	/**
	 * RegSingleton本身的实例化， 这里采用了饿汉式
	 */
	static private HashMap<String, RegSingleton> m_registry = new HashMap<String, RegSingleton>();
	static {
		RegSingleton x = new RegSingleton();
		m_registry.put(x.getClass().getName(), x);
	}

	/**
	 * 保护的默认构造子
	 */
	protected RegSingleton() {
	}

	/**
	 * 静态工厂方法，返还此类惟一的实例
	 */
	static public RegSingleton getInstance(String name) {
		if (name == null) {
			name = "com.echo.designpattern.singleton.RegSingleton";
		}
		if (m_registry.get(name) == null) {
			try {
				m_registry.put(name, (RegSingleton) Class.forName(name).newInstance());
			} catch (Exception e) {
				System.out.println("Error happened.");
			}
		}
		return (RegSingleton) (m_registry.get(name));
	}

	/**
	 * 一个示意性的商业方法
	 */
	public String about() {
		return "Hello， I am RegSingleton.";
	}

}
