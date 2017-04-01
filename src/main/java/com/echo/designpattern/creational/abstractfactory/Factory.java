package com.echo.designpattern.creational.abstractfactory;

public interface Factory {

    CPU getCPU(String name);

    Screen getScreen(String name);
}
