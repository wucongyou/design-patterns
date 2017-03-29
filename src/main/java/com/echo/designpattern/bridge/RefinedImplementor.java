package com.echo.designpattern.bridge;

public class RefinedImplementor extends Implementor {

    @Override
    public void doOperate() {
        System.out.println("This is refined implementor acting.");
    }

    public void anotherOperationPart1() {
        System.out.println("This is another doOperate part 1.");
    }

    public void anotherOperationPart2() {
        System.out.println("This is another doOperate part 2.");
    }
}
