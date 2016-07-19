package com.echo.designpattern.builder;

public interface Builder {
	public void buildMainBoard();

	public void buildCpu();

	public void buildGpu();

	public void buildMemory();

	public void buildDisk();

	public void buildPower();

	public Computer retrieveResult();
}
