package com.echo.designpattern.factorymethod;

public class SenderFactoryWithMultiMethod {
	   public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    }  
}
