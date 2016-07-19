package com.echo.designpattern.factorymethod;

public class SenderFactoryWithStaticMethod {
    public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
