package com.echo.designpattern.builder;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.buildMainBoard();
		builder.buildCpu();
		builder.buildGpu();
		builder.buildMemory();
		builder.buildDisk();
		builder.buildPower();
	}
}
