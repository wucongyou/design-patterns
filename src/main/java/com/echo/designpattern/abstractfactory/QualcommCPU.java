package com.echo.designpattern.abstractfactory;

public class QualcommCPU implements CPU {

	@Override
	public void calculate() {
		System.out.println("Qualcomm CPU is calculating.");
	}

}
