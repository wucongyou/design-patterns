package com.echo.designpattern.creational.abstractfactory;

public interface IFactory {

    ICPU getCPU(String name);

    IScreen getScreen(String name);

}
