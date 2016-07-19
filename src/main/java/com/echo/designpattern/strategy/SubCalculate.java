package com.echo.designpattern.strategy;
/**
 * 计算策略的具体实现类：整数减法
 */
public class SubCalculate implements CalculateStrategy {

	@Override
	public double calculate(int a, int b) {
		return a - b;
	}

}
