package com.echo.designpattern.singleton;

import org.junit.Before;
import org.junit.Test;

public class DCLVolatileSingletonWithStringParamTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		DCLVolatileSingletonWithStringParam dcls=DCLVolatileSingletonWithStringParam.getInstance();
	//	assertThat(dcls,is(null));
		System.out.println(dcls==null);
		DCLVolatileSingletonWithStringParam.init("initializing...");
		dcls=DCLVolatileSingletonWithStringParam.getInstance();
		System.out.println(dcls==null);
		
	}

}
