package com.echo.designpattern.strategy;

/**
 * 计算策略的具体实现类：整数加法
 */
public class AddCalculate implements CalculateStrategy {

	@Override
	public double calculate(int a, int b) {
		return a + b;
	}

}
