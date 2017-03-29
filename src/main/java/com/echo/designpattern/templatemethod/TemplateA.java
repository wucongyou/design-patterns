package com.echo.designpattern.templatemethod;

public class TemplateA extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        System.out.println("The abstract doSomething can only implemented by concrete template.");
    }

}
