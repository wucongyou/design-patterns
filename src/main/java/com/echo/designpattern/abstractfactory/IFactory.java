package com.echo.designpattern.abstractfactory;

public interface IFactory {

  ICPU assembleCPU();

  IScreen assembleScreen();

}
