package com.echo.designpattern.factorymethod;

import org.junit.Before;
import org.junit.Test;

public class SenderFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProduce() {
		 SenderFactory factory = new SenderFactory();  
	        Sender sender = factory.produce("sms");  
	        sender.Send();  
	}
	@Test
	public void testProduceMail() {
		 SenderFactoryWithMultiMethod factory = new SenderFactoryWithMultiMethod();  
	        Sender sender = factory.produceMail();  
	        sender.Send();  
	}
	
	@Test
	public void testProduceMailStatic() {
	        Sender sender = SenderFactoryWithStaticMethod.produceMail();  
	        sender.Send();  
	}
	
}
