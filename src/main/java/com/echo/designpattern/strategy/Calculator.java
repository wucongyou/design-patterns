package com.echo.designpattern.strategy;

/**
 * 计算策略的应用类：简易计算器
 */
public class Calculator {
	private int ope1;
	private int ope2;
	private CalculateStrategy calculateStrategy;

	public Calculator() {
	}

	public Calculator(CalculateStrategy calculateStrategy) {
		this.calculateStrategy = calculateStrategy;
	}

	public double getResult() {
		return calculateStrategy.calculate(ope1, ope2);
	}

	public int getOpe1() {
		return ope1;
	}

	public void setOpe1(int ope1) {
		this.ope1 = ope1;
	}

	public int getOpe2() {
		return ope2;
	}

	public void setOpe2(int ope2) {
		this.ope2 = ope2;
	}

	public CalculateStrategy getCalculateStrategy() {
		return calculateStrategy;
	}

	public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
		this.calculateStrategy = calculateStrategy;
	}

}
