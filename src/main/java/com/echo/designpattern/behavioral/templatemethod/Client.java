package com.echo.designpattern.behavioral.templatemethod;

public class Client {

    public static void main(String[] args) {
        AbstractTemplate template = new TemplateA();
        template.templateMethod();
        template = new TemplateB();
        template.templateMethod();
    }

}
