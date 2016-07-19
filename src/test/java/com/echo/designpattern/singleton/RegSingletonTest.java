package com.echo.designpattern.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RegSingletonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSuper() {
		String name=null;
		RegSingleton rs=RegSingleton.getInstance(name);
		RegSingleton rs2=RegSingleton.getInstance(name);
		System.out.println(rs.about());
		System.out.println(rs==rs2);
	}

	@Test
	public void testSub() {
		String name="com.echo.designpattern.singleton.RegSingletonChild";
		RegSingleton rs=RegSingleton.getInstance(name);
		RegSingleton rs2=RegSingleton.getInstance(name);
		System.out.println(rs.about());
		System.out.println(rs==rs2);
	}
}
