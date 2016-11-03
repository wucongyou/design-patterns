package com.echo.designpattern.builder;

public interface IBuilder {

  void buildMainBoard();

  void buildCpu();

  void buildGpu();

  void buildMemory();

  void buildDisk();

  void buildPower();

  Computer retrieveResult();

}
