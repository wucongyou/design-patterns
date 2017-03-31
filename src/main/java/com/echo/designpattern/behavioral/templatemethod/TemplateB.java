package com.echo.designpattern.behavioral.templatemethod;

public class TemplateB extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        System.out.println("The abstract doSomething can only implemented by concrete template.");
    }

    @Override
    protected void hookMethod() {
        System.out.println("Now the hook doSomething is overrided by concrete template.");
    }

}
