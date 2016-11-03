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
    ISender sender = factory.produce("sms");
    sender.send("Hi,there");
  }

  @Test
  public void testProduceMail() {
    SenderFactoryWithMultiMethod factory = new SenderFactoryWithMultiMethod();
    ISender sender = factory.produceMailSender();
    sender.send("Hi,there");
  }

  @Test
  public void testProduceMailStatic() {
    ISender sender = SenderFactoryWithStaticMethod.produceMail();
    sender.send("Hi,there");
  }

}
