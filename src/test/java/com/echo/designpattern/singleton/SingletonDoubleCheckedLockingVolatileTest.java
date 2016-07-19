package com.echo.designpattern.singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Before;
import org.junit.Test;

public class SingletonDoubleCheckedLockingVolatileTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testReadResolve() throws IOException, ClassNotFoundException {
		DCLVolatileSingleton demo = DCLVolatileSingleton.getInstance();
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(buf);
		out.writeObject(demo);ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		DCLVolatileSingleton demo1 = (DCLVolatileSingleton) in.readObject();
		System.out.println(demo == demo1); // true
	}

}
