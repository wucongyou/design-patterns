package com.echo.designpattern.abstractfactory;

public class AppleFactory implements IFactory {

    @Override
    public ICPU getCPU(String name) {
        return new AppleCPU(name);
    }

    @Override
    public IScreen getScreen(String name) {
        return new AppleScreen(name);
    }

}
