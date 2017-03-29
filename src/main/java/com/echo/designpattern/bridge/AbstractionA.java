package com.echo.designpattern.bridge;

public class AbstractionA extends Abstraction {

    public AbstractionA(Implementor implementor) {
        super(implementor);
    }

    @Override
    public ImplementorA getImplementor() {
        return (ImplementorA) super.getImplementor();
    }

    @Override
    public void operation() {
        getImplementor().doOperate();
    }

    public void anotherOperation() {
        System.out.println("This is another doOperate acting.");
        getImplementor().anotherOperationPart1();
        getImplementor().anotherOperationPart2();
    }

}
