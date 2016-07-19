package com.echo.designpattern.abstractfactory;

import org.junit.Before;
import org.junit.Test;

public class ProviderTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testProduce() {
		Provider provider = new MailSenderFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
	}

}
