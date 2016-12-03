package com.echo.designpattern.abstractfactory;

public interface IFactory {

  ICPU getCPU(String name);

  IScreen getScreen(String name);

}
